package irvine.math.plantri;

import irvine.math.MutableInteger;

/**
 * The recursive search procedure for polytopes.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
class PolytopeScanner {

  protected final Plantri mPlantri;
  protected final PlantriGraphState mState;
  protected final Numbering mNumbering;
  protected final Marks mVertexMarks;
  protected final int[] mEdgeBounds;
  protected final int mMaxFaceSize;
  protected final int[] mDegree;
  protected final Edge[] mFirstEdge;

  // Used for polytope generation - lists edges whose left face is maximum size
  protected final Edge[] mInMaxFace = new Edge[Plantri.MAX_VERTICES * Plantri.MAX_VERTICES - 3 * Plantri.MAX_VERTICES / 2];

  // Unpacked adjacency matrix is used for general planar graphs of connectivity 1 and 2.
  protected final char[][] mAdjMat = new char[Plantri.MAX_VERTICES][64];

  private boolean isNeqAdj(final int i, final int j) {
    return mAdjMat[i][j] == 0;
  }

  private int degEnd(final Edge e) {
    return mDegree[e.mEnd];
  }

  private interface Op {
    boolean isOk(final Edge e);

    int col(final Edge e);
  }

  private class OrOp implements Op {
    @Override
    public boolean isOk(final Edge e) {
      return isNeqAdj(e.mStart, e.mInverse.mPrev.mEnd);
    }

    @Override
    public int col(final Edge e) {
      return (mDegree[e.mInverse.mPrev.mEnd] << 10) + e.mLeftFaceSize;
    }
  }

  private class InvOp implements Op {
    @Override
    public boolean isOk(final Edge e) {
      return isNeqAdj(e.mStart, e.mInverse.mNext.mEnd);
    }

    @Override
    public int col(final Edge e) {
      return (mDegree[e.mInverse.mNext.mEnd] << 10) + e.mInverse.mLeftFaceSize;
    }
  }

  private final Op mOrOp = new OrOp();
  private final Op mInvOp = new InvOp();

  PolytopeScanner(final Plantri plantri, final Numbering numbering, final Marks vertexMarks, final int[] edgeBounds, final int maxFaceSize) {
    mPlantri = plantri;
    mState = plantri.getState();
    mNumbering = numbering;
    mVertexMarks = vertexMarks;
    mEdgeBounds = edgeBounds;
    mMaxFaceSize = maxFaceSize;
    mDegree = mState.mDegree;
    mFirstEdge = mState.mFirstEdge;
  }

  /* Tests whether the graph obtained by deleting Edge e is still 2-connected.
     The edge e may have been deleted or not, but the values in e must be
     as before it was (possibly) deleted. The map must have been 2-connected
     before.  degree[] is not assumed correct for the end-vertices of e.

     On the left hand side of e there must be a triangle (e.mLeftFaceSize==3).

     If there is a 1-cut, it cannot be e.mStart or e.end (otherwise
     it was a 1-cut before), but they must be in different components, (same
     reason), so v=e.mPrev.end MUST be the cut-vertex.
     It is checked whether v is contained in the face on the right hand side
     of e (before deleting).

     Returns 1 if it is 2-connected after deleting e, 0 else.
  */
  private int twoConn(final Edge e) {
    Edge end = e.mNext;
    if (end == e.mPrev) {
      return 0;
    }
    end = end.mInverse;
    final int v = e.mPrev.mEnd;
    if (mDegree[v] == 2) {
      return 1;
    }
    for (Edge run = e.mInverse.mPrev; run != end; run = run.mInverse.mPrev) {
      if (run.mEnd == v) {
        return 0;
      }
    }
    return 1;
  }


  /* Assumes there is a 3-face on the left of eDel, and that eDel can be
       deleted while keeping mDegrees >= mMinPolyDeg.  Also, the new face created
       will be a largest face.  oldMaxFace is the size of the largest face so far,
       and IN_MAX_FACE[oldMaxList0..oldMaxList1-1] are the edges with a face of
       maximum size on the left.  *connectivity is the current connectivity (or 3,
       whichever is smaller).
  
       This procedure deletes eDel provided the result is at least as connected
       as minpolyconn, and that the procedure believes the re-insertion of eDel
       might be a canonical edge insertion.  The latter decision is based on
       four combinatorial invariants: the three vertex mDegrees at the ends of
       *eDel and on its left, and the size of the face to the left of eDel.mPrev.
  
       In case eDel passes the test and is deleted, the edges which may
       represent the re-insertion of eDel and optimise the four-part invariant
       mentioned above are put in goodOr[0..*nCanOr-1] and
       goodInv[0..nCanInv-1].  This will include at least one of the edges
       eDel.mPrev, eDel.mInverse.mNext and (if there is also a 3-face on the
       right of eDel) eDel.mNext and eDel.mInverse.mPrev.  Then all other edges
       which might possibly represent canonical edge insertions are put in
       goodOr[*nCanOr..*nGoodOr-1] or goodInv[nCanInv..nGoodInv-1].
       The *Or edges are those for which the inserted edge will be in the
       mNext direction, and the *Inv edges .. the mPrev direction.
  
       In addition, if eDel is deleted, IN_MAX_FACE[*newMaxList0..newMaxList1-1]
       will have all edges with a maximum face on the left (that size being put
       into newMaxFace).  This list may overlap
       IN_MAX_FACE[oldMaxList0..oldMaxList1-1] if the max face size does not
       increase.
  
       In the case of value 0, connectivity is changed to represent the new
       connectivity (or 3, whichever is smaller).
  
       Return values:   0 = ok
                        1 = rejected as connectivity will be too small
                        2 = rejected by colour
    */
  int maybeDelete(final Edge eDel, final int oldMaxFace, int oldMaxList0, final int oldMaxList1,
                  final MutableInteger newMaxFace, final MutableInteger newMaxList0, final MutableInteger newMaxList1,
                  final Edge[] goodOr, final MutableInteger nGoodOr, final MutableInteger nCanOr,
                  final Edge[] goodInv, final MutableInteger nGoodInv, final MutableInteger nCanInv, final MutableInteger connectivity) {
    final int maxface = eDel.mInverse.mLeftFaceSize + 1;
    newMaxFace.set(maxface);
    if (maxface > oldMaxFace) {
      oldMaxList0 = oldMaxList1;
    }
    newMaxList0.set(oldMaxList0);

    nGoodOr.set(0);
    nGoodInv.set(0);

    /* Now old edges that will be on a largest face (if eDel is deleted)
       are in places oldMaxList0..oldMaxList1-1.  New edges will be from
       oldMaxList1 to *newMaxList1-1, but newMaxList1 is not set yet. */
    final int v1 = eDel.mStart;
    final int v2 = eDel.mEnd;
    /* maxdeg = (mDegree[v1] > mDegree[v2] ? mDegree[v1] : mDegree[v2]) - 1;  BDM 2/5/09 */

    // mindeg and maxdeg are the degrees of the ends of eDel after deletion
    final int mindeg;
    final int maxdeg;
    if (mDegree[v1] < mDegree[v2]) {
      mindeg = mDegree[v1] - 1;
      maxdeg = mDegree[v2] - 1;
    } else {
      mindeg = mDegree[v2] - 1;
      maxdeg = mDegree[v1] - 1;
    }

    final Edge e1 = eDel.mPrev;
    final int v3 = e1.mEnd;
    final Edge e4 = eDel.mNext;
    final int v4 = e4.mEnd;
    final Edge e3 = eDel.mInverse.mPrev;

    // The following is an efficiency short-cut, but it is assumed to have been done below.
    if (maxface == 4) {
      if (isNeqAdj(v3, v4) && (mDegree[v3] > maxdeg || mDegree[v4] > maxdeg)) {
        return 2;
      }
    } else if (mDegree[v3] > maxdeg) {
      if (isNeqAdj(v3, e3.mEnd) || isNeqAdj(v3, v4)) {
        return 2;
      }
    }

    final Edge e2 = eDel.mInverse.mNext;
    reduceDegree(v1, v2);

    long maxcol = 0;
    int ncOr = 0;
    int ncInv = 0;
    int nml1 = 0;

    if (mDegree[v1] == maxdeg) {
      long col = degEnd(e1);
      maxcol = col;
      goodOr[ncOr++] = e1;

      if (maxface == 4) {
        col = degEnd(e4);
        if (col > maxcol) {
          ncOr = ncInv = 0;
          goodInv[ncInv++] = e4;
          maxcol = col;
        } else if (col == maxcol) {
          goodInv[ncInv++] = e4;
        }
      }
    }

    if (mDegree[v2] == maxdeg) {
      long col = degEnd(e2);
      if (col > maxcol) {
        ncOr = ncInv = 0;
        goodInv[ncInv++] = e2;
        maxcol = col;
      } else if (col == maxcol) {
        goodInv[ncInv++] = e2;
      }

      if (maxface == 4) {
        col = degEnd(e3);
        if (col > maxcol) {
          ncOr = ncInv = 0;
          goodOr[ncOr++] = e3;
          maxcol = col;
        } else if (col == maxcol) {
          goodOr[ncOr++] = e3;
        }
      }
    }

    int ngOr = ncOr;
    int ngInv = ncInv;

    if (maxface == 4) {
      // Recall from above that mDegree[v3,v4] <= maxdeg
      if (isNeqAdj(v3, v4)) {
        final int col1 = mDegree[v1];
        final int col2 = mDegree[v2];

        if (mDegree[v3] == maxdeg) {
          if (col1 > maxcol) {
            ++mDegree[v1];
            ++mDegree[v2];
            return 2;
          } else if (col1 == maxcol) {
            goodInv[ngInv++] = e1.mInverse;
          }
          if (col2 > maxcol) {
            ++mDegree[v1];
            ++mDegree[v2];
            return 2;
          } else if (col2 == maxcol) {
            goodOr[ngOr++] = e2.mInverse;
          }
        }

        if (mDegree[v4] == maxdeg) {
          if (col1 > maxcol) {
            ++mDegree[v1];
            ++mDegree[v2];
            return 2;
          } else if (col1 == maxcol) {
            goodOr[ngOr++] = e4.mInverse;
          }
          if (col2 > maxcol) {
            ++mDegree[v1];
            ++mDegree[v2];
            return 2;
          } else if (col2 == maxcol) {
            goodInv[ngInv++] = e3.mInverse;
          }
        }
      }

      nml1 = oldMaxList1;
      mInMaxFace[nml1++] = e1.mInverse;
      mInMaxFace[nml1++] = e2;
      mInMaxFace[nml1++] = e3.mInverse;
      mInMaxFace[nml1++] = e4;
    } else {
      final int v5 = e3.mEnd;
      // Recall from above that mDegree[v3] <= maxdeg
      if (isNeqAdj(v3, v5)) {
        if (mDegree[v5] > maxdeg) {
          increaseDegree(v1, v2);
          return 2;
        }
        final long col = mDegree[v2];
        if (mDegree[v3] == maxdeg) {
          if (col > maxcol) {
            increaseDegree(v1, v2);
            return 2;
          } else if (col == maxcol) {
            goodOr[ngOr++] = e2.mInverse;
          }
        }
        if (mDegree[v5] == maxdeg) {
          if (col > maxcol) {
            increaseDegree(v1, v2);
            return 2;
          } else if (col == maxcol) {
            goodInv[ngInv++] = e3.mInverse;
          }
        }
      }
      if (isNeqAdj(v3, v4)) {
        if (mDegree[v4] > maxdeg) {
          increaseDegree(v1, v2);
          return 2;
        }
        final long col = mDegree[v1];
        if (mDegree[v3] == maxdeg) {
          if (col > maxcol) {
            increaseDegree(v1, v2);
            return 2;
          } else if (col == maxcol) {
            goodInv[ngInv++] = e1.mInverse;
          }
        }
        if (mDegree[v4] == maxdeg) {
          if (col > maxcol) {
            increaseDegree(v1, v2);
            return 2;
          } else if (col == maxcol) {
            goodOr[ngOr++] = e4.mInverse;
          }
        }
      }

      nml1 = oldMaxList1;

      Edge ea = e3.mInverse;
      Edge eb = ea.mPrev;
      do {
        if (isNeqAdj(ea.mEnd, eb.mEnd)) {
          final int da = degEnd(ea);
          final int db = degEnd(eb);
          if (da > maxdeg || db > maxdeg) {
            increaseDegree(v1, v2);
            return 2;
          }
          final long col = mDegree[ea.mStart];
          if (da == maxdeg) {
            if (col > maxcol) {
              increaseDegree(v1, v2);
              return 2;
            } else if (col == maxcol) {
              goodOr[ngOr++] = ea.mInverse;
            }
          }
          if (db == maxdeg) {
            if (col > maxcol) {
              increaseDegree(v1, v2);
              return 2;
            } else if (col == maxcol) {
              goodInv[ngInv++] = eb.mInverse;
            }
          }
        }
        mInMaxFace[nml1++] = ea;
        ea = eb.mInverse;
        eb = ea.mPrev;
      } while (ea != e4);

      mInMaxFace[nml1++] = e2;
      mInMaxFace[nml1++] = e1.mInverse;
      mInMaxFace[nml1++] = e4;
    }
    
    // Now test old edges still on max faces
    for (int i = oldMaxList0; i < oldMaxList1; ++i) {
      Edge ee = mInMaxFace[i];
      if (mDegree[ee.mStart] > maxdeg) {
        if (mInvOp.isOk(ee)) {
          increaseDegree(v1, v2);
          return 2;
        }
        ee = ee.mPrev;
        if (mOrOp.isOk(ee)) {
          increaseDegree(v1, v2);
          return 2;
        }
      } else if (mDegree[ee.mStart] == maxdeg) {
        long col = degEnd(ee);
        if (col > maxcol) {
          if (mInvOp.isOk(ee)) {
            increaseDegree(v1, v2);
            return 2;
          }
        } else if (col == maxcol && mInvOp.isOk(ee)) {
          goodInv[ngInv++] = ee;
        }
        ee = ee.mPrev;
        col = degEnd(ee);
        if (col > maxcol) {
          if (mOrOp.isOk(ee)) {
            increaseDegree(v1, v2);
            return 2;
          }
        } else if (col == maxcol && mOrOp.isOk(ee)) {
          goodOr[ngOr++] = ee;
        }
      }
    }

    final int newconnec;
    if (mindeg < connectivity.get()) {
      newconnec = mindeg;
    } else if (connectivity.get() == 3) {
      newconnec = 2 + (eDel.threeConn(this) ? 1 : 0);
    } else if (connectivity.get() == 2) {
      newconnec = 1 + twoConn(eDel);
    } else {
      newconnec = 1;
    }

    if (newconnec < mPlantri.getMinPolyConnectivity()) {
      ++mDegree[v1];
      ++mDegree[v2];
      return 1;
    }

    // Now we have complete success!  Just prune the lists a bit and complete the deletion of eDel.
    eDel.mPrev.mNext = eDel.mNext;
    eDel.mNext.mPrev = eDel.mPrev;
    final Edge ee = eDel.mInverse;
    ee.mPrev.mNext = ee.mNext;
    ee.mNext.mPrev = ee.mPrev;

    for (int i = oldMaxList1; i < nml1; ++i) {
      mInMaxFace[i].mLeftFaceSize = maxface;
    }

    mFirstEdge[v1] = e1;
    mFirstEdge[v2] = e2;
    mState.mNumEdges -= 2;

    connectivity.set(newconnec);

    newMaxList1.set(nml1);
    nGoodOr.set(ngOr);
    nGoodInv.set(ngInv);
    nCanOr.set(ncOr);
    nCanInv.set(ncInv);

    if (ngOr + ngInv == 1) {
      return 0;
    }
    final long maxCol = getMaxCol(ncInv, mInvOp, goodInv, getMaxCol(ncOr, mOrOp, goodOr, 0));
    if (isTriAdded(ncOr, ngOr, maxCol, eDel, goodOr, nCanOr, nGoodOr, nGoodInv, mOrOp)) {
      return 2;
    }
    if (isTriAdded(ncInv, ngInv, maxCol, eDel, goodInv, nCanInv, nGoodInv, nGoodOr, mInvOp)) {
      return 2;
    }
    return 0;
  }

  private static long getMaxCol(final int limit, final Op op, final Edge[] good, long maxCol) {
    for (int i = 0; i < limit; ++i) {
      if (op.col(good[i]) > maxCol) {
        maxCol = op.col(good[i]);
      }
    }
    return maxCol;
  }

  private boolean isTriAdded(final int ncLimit, final int ngLimit, final long maxCol, final Edge eDel, final Edge[] good, final MutableInteger nCan, final MutableInteger nGoodA, final MutableInteger nGoodB, final Op op) {
    int i, k;
    for (i = 0, k = 0; i < ncLimit; ++i) {
      if (op.col(good[i]) == maxCol) {
        good[k++] = good[i];
      }
    }
    nCan.set(k);
    for (; i < ngLimit; ++i) {
      final long col = op.col(good[i]);
      if (col == maxCol) {
        good[k++] = good[i];
      } else if (col > maxCol) {
        insertEdgeTri(eDel);
        nGoodA.set(0);
        nGoodB.set(0);
        return true;
      }
    }
    nGoodA.set(k);
    return false;
  }

  void amDelEdge(final int i, final int j) {
    mAdjMat[i][j] = 0;
    mAdjMat[j][i] = 0;
  }

  void amAddEdge(final int i, final int j) {
    mAdjMat[i][j] = 1;
    mAdjMat[j][i] = 1;
  }

  void increaseDegree(final int v1, final int v2) {
    ++mDegree[v1];
    ++mDegree[v2];
  }

  void reduceDegree(final int v1, final int v2) {
    --mDegree[v1];
    --mDegree[v2];
  }

  /* inserts the edge previously deleted -- e may not have been modified in
       the meantime and the map must look exactly like it looked before deleting
       it. On the left hand side of e there must be a triangle after inserting e */
  void insertEdgeTri(Edge e) {

    mState.mNumEdges += 2;

    e.mPrev.mNext = e;
    e.mNext.mPrev = e;
    ++mDegree[e.mStart];

    e = e.mInverse;
    e.mPrev.mNext = e;
    e.mNext.mPrev = e;
    ++mDegree[e.mStart];

    // now the face on the right of e when entering this function is on the left of run
    final int newFaceSize = e.mLeftFaceSize;

    Edge run;
    for (run = e.mPrev.mInverse; run != e; run = run.mPrev.mInverse) {
      run.mLeftFaceSize = newFaceSize;
    }

    run = e.mNext;
    run.mLeftFaceSize = 3;
    run.mInverse.mNext.mLeftFaceSize = 3;
  }

  /* This is the recursive search procedure for polytopes.
     oldFeas[0..nOldFeas-1] are the edges which can be removed without
     violating the mDegree bound mMinPolyDeg, with some (but not necessarily
     all) missing because they are known to violate the connectivity
     bound mMinPolyConnec.  nbtot/nbop represent the group, as usual.
     oldMaxFace is the size of the largest face.
     IN_MAX_FACE[oldMaxList0..oldMaxList1-1] lists the edges whose
     left face has greatest size (unless that is 3).  connectivity is
     the actual connectivity, except that values greater than 3
     are given as 3. */
  void scan(final int nbtot, final int nbop, final Edge[] oldFeas, int nOldFeas,
            final int oldMaxFace, final int oldMaxList0, final int oldMaxList1, final int connectivity) {
    final Edge[] newFeas = new Edge[Plantri.MAX_EDGES / 2];
    final Edge[] goodOr = new Edge[Plantri.MAX_EDGES];
    final Edge[] goodInv = new Edge[Plantri.MAX_EDGES];
    final int[] minimal = new int[Plantri.MAX_EDGES / 2];
    final MutableInteger newMaxFace = new MutableInteger();

    if (mState.mNumEdges <= mEdgeBounds[1]) {
      mPlantri.gotOne(nbtot, nbop, connectivity);
    }
    if (mState.mNumEdges == mEdgeBounds[0]) {
      return;
    }
    if (mState.mNumEdges - 2 * nOldFeas > mEdgeBounds[1]) {
      return;
    }

    mPlantri.markEdgeOrbits(oldFeas, nOldFeas, minimal, nbtot);

    final MutableInteger newMaxList0 = new MutableInteger();
    final MutableInteger newMaxList1 = new MutableInteger();
    final MutableInteger newConnectivity = new MutableInteger();
    final MutableInteger nGoodOr = new MutableInteger();
    final MutableInteger nCanOr = new MutableInteger();
    final MutableInteger nGoodInv = new MutableInteger();
    final MutableInteger nCanInv = new MutableInteger();
    final MutableInteger xnbtot = new MutableInteger();
    final MutableInteger xnbop = new MutableInteger();

    for (int i = 0; i < nOldFeas; ++i) {
      if (minimal[i] == 0) {
        continue;
      }

      Edge e = oldFeas[i];
      if (e.mLeftFaceSize != 3) {
        e = e.mInverse;
      }
      if (e.mInverse.mLeftFaceSize < oldMaxFace - 1 || e.mInverse.mLeftFaceSize == mMaxFaceSize) {
        continue;
      }

      amDelEdge(e.mStart, e.mEnd);

      newConnectivity.set(connectivity);
      final int code = maybeDelete(e, oldMaxFace, oldMaxList0, oldMaxList1, newMaxFace, newMaxList0, newMaxList1, goodOr, nGoodOr, nCanOr, goodInv, nGoodInv, nCanInv, newConnectivity);

      if (code == 0) {
        if (nGoodOr.get() + nGoodInv.get() == 1) {
          final Edge esave = oldFeas[i];
          oldFeas[i] = oldFeas[nOldFeas - 1];
          final int nNewFeas = mPlantri.prunePolyEdgelist(oldFeas, nOldFeas - 1, newFeas);
          oldFeas[i] = esave;
          scan(1, 1, newFeas, nNewFeas, newMaxFace.get(), newMaxList0.get(), newMaxList1.get(), newConnectivity.get());
        } else if (Canon.canonEdgeOriented(mPlantri, goodOr, nGoodOr.get(), nCanOr.get(), goodInv, nGoodInv.get(), nCanInv.get(), mDegree, mNumbering, xnbtot, xnbop)) {
          /* The following line corrects for the fact that canonEdgeOriented()
             finds each automorphism twice if the maximum degree is
             at most 2.  However, it interferes with -o so is disabled.
    
             if (mState.mNumEdges <= 2*mState.mNumVertices && maxmDegree() <= 2) xnbtot = xnbop;
          */
          final Edge esave = oldFeas[i];
          oldFeas[i] = oldFeas[nOldFeas - 1];
          final int nNewFeas = mPlantri.prunePolyEdgelist(oldFeas, nOldFeas - 1, newFeas);
          oldFeas[i] = esave;
          scan(xnbtot.get(), xnbop.get(), newFeas, nNewFeas, newMaxFace.get(), newMaxList0.get(), newMaxList1.get(), newConnectivity.get());
        }
        insertEdgeTri(e);
      } else if (code == 1) {
        oldFeas[i] = oldFeas[--nOldFeas];
        minimal[i--] = minimal[nOldFeas];
      }
      amAddEdge(e.mStart, e.mEnd);
    }
  }
}

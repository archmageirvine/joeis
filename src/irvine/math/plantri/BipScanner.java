package irvine.math.plantri;

import irvine.math.MutableInteger;

/**
 * The recursive search procedure for bipartite graphs.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
public class BipScanner {

  private final Plantri mPlantri;
  private final PlantriGraphState mState;
  private final Numbering mNumbering;
  private final Marks mVertexMarks;
  private final int[] mEdgeBounds;
  private final int mMaxFaceSize;
  private final int[] mDegree;
  private final Edge[] mFirstEdge;

  // Used for polytope generation - lists edges whose left face is maximum size
  private final Edge[] mInMaxFace = new Edge[Plantri.MAX_VERTICES * Plantri.MAX_VERTICES - 3 * Plantri.MAX_VERTICES / 2];

  BipScanner(final Plantri plantri, final Numbering numbering, final Marks vertexMarks, final int[] edgeBounds, final int maxFaceSize) {
    mPlantri = plantri;
    mState = plantri.getState();
    mNumbering = numbering;
    mVertexMarks = vertexMarks;
    mEdgeBounds = edgeBounds;
    mMaxFaceSize = maxFaceSize;
    mDegree = mState.mDegree;
    mFirstEdge = mState.mFirstEdge;
  }

  /* The following unpacked adjacency matrix is used for general planar
     graphs of connectivity 1 and 2. */
  private final char[][] mAdjMat = new char[Plantri.MAX_VERTICES][64];

  /* inserts the edge previously deleted -- e may not have been modified in
     the meantime and the map must look exactly like it looked before deleting
     it. There is no special face size required on the left hand side of e */
  private void insertEdgeGeneral(Edge e) {
    mState.mNumEdges += 2;
    e.mPrev.mNext = e;
    e.mNext.mPrev = e;
    mDegree[e.mStart]++;
    e = e.mInverse;
    e.mPrev.mNext = e;
    e.mNext.mPrev = e;
    mDegree[e.mStart]++;
  
    // now the face on the right of e when entering this function is on the left of run
    int newFaceSize = e.mLeftFaceSize;
    for (Edge run = e.mPrev.mInverse; run != e; run = run.mPrev.mInverse) {
      run.mLeftFaceSize = newFaceSize;
    }

    e = e.mInverse; /* back to the old */
    newFaceSize = e.mLeftFaceSize;
    for (Edge run = e.mPrev.mInverse; run != e; run = run.mPrev.mInverse) {
      run.mLeftFaceSize = newFaceSize;
    }
  }

  /* tests whether the graph obtained by deleting EDGE e is still 2-connected.
       The edge e may have been deleted or not, but the values in e must be
       as before it was (possibly) deleted. The map must have been 2-connected
       before.  degree[] is not assumed correct for the end vertices of e.
  
       On the left hand side of e there must be a quadrangle (e.mLeftFaceSize==3).
  
       If there is a 1-cut, it cannot be e.mStart or e.mEnd (otherwise
       it was a 1-cut before), but they must be in different components, (same
       reason), so v=e.mPrev.mEnd or w=e.mInverse.mNext.mEnd MUST be the cut-vertex.
       It is checked whether v or w are contained in the face on the right hand side
       of e (before deleting).
  
       Returns 1 if it is 2-connected after deleting e, 0 else.
    */
  private int twoConnQuad(final Edge e) {
    mVertexMarks.resetMarksVertex();
    mVertexMarks.markVertex(e.mPrev.mEnd);
    mVertexMarks.markVertex(e.mInverse.mNext.mEnd);
    final Edge end = e.mNext.mInverse;
    for (Edge run = e.mInverse.mPrev; run != end; run = run.mInverse.mPrev) {
      if (mVertexMarks.isMarkedVertex(run.mEnd)) {
        return 0;
      }
    }
    return 1;
  }

  private int threeconnQuad(final Edge e) {
    mVertexMarks.resetMarksVertex();
    // The end vertices of e need not be marked
    for (Edge run = e.mNext, end = e.mInverse.mPrev.mInverse; run != end; run = run.mInverse.mNext) {
      mVertexMarks.markVertex(run.mEnd);
    }

    // OK -- now test v
    Edge start = e.mPrev.mInverse;
    Edge end = start.mPrev;

    // the face on the right hand side of start contains e.start so need not be tested
    start = start.mNext;
    while (start != end) {
      Edge run = start.mInverse;
      start = start.mNext;
      for (; run != start; run = run.mPrev.mInverse) {
        if (mVertexMarks.isMarkedVertex(run.mStart)) {
          return 0;
        }
      }
    }

    // OK -- now test w. The face that also contains v was already tested
    if (mDegree[end.mEnd] == 3) {
      return 1;
    }

    start = end.mInverse.mNext;
    end = end.mInverse.mPrev.mPrev;

    while (start != end) {
      Edge run = start.mInverse;
      start = start.mNext;
      for (; run != start; run = run.mPrev.mInverse) {
        if (mVertexMarks.isMarkedVertex(run.mStart)) {
          return 0;
        }
      }
    }

    return 1;
  }

  int pruneBipEdgelist(final Edge[] old, final int numold, final Edge[] newe) {
    int counter = 0;
    for (int i = 0; i < numold; ++i) {
      final Edge e = old[i];
      if (mDegree[e.mStart] > mPlantri.getMinPolyDegree() && mDegree[e.mEnd] > mPlantri.getMinPolyDegree()
        && (e.mLeftFaceSize == 4 || e.mInverse.mLeftFaceSize == 4)) {
        newe[counter++] = e;
      }
    }
    return counter;
  }

  private boolean isNeqAdj(final int i, final int j) {
    return mAdjMat[i][j] == 0;
  }

  private int degendb(final Edge e) {
    return mDegree[e.mEnd];
  }

  private boolean orokb(final Edge e) {
    return isNeqAdj(e.mStart, e.mInverse.mPrev.mInverse.mPrev.mEnd);
  }

  private boolean invokb(final Edge e) {
    return isNeqAdj(e.mStart, e.mInverse.mNext.mInverse.mNext.mEnd);
  }

  private int orcolb(final Edge e) {
    return (mDegree[e.mInverse.mPrev.mEnd] << 10) + e.mLeftFaceSize;
  }

  private int invcolb(final Edge e) {
    return (mDegree[e.mInverse.mNext.mEnd] << 10) + e.mInverse.mLeftFaceSize;
  }

  private void incDegree(final int v1, final int v2) {
    mDegree[v1]++;
    mDegree[v2]++;
  }

  /* Assumes there is a 4-face on the left of eDel, and that eDel can be
       deleted while keeping degrees >= mMinPolyDeg.  Also, the new face created
       will be a largest face.  oldMaxFace is the size of the largest face so far,
       and IN_MAX_FACE[oldMaxList0..oldMaxList1-1] are the edges with a face of
       maximum size on the left.  connectivity is the current connectivity.
  
       This procedure deletes *eDel provided the result is at least as connected
       as minPolyConn, and that the procedure believes the re-insertion of eDel
       might be a canonical edge insertion.  The latter decision is based on
       four combinatorial invariants: the three vertex degrees at the ends of
       eDel and on its left, and the size of the face to the left of eDel.mPrev.
  
       In case eDel passes the test and is deleted, the edges which may
       represent the re-insertion of eDel and optimise the four-part invariant
       mentioned above are put in goodOr[0..nCanOr-1] and
       goodInv[0..nCanInv-1].  This will include at least one of the edges
       eDel.mPrev, eDel.mInverse.mNext and (if there is also a 4-face on the
       right of eDel) eDel.mNext and eDel.mInverse.mPrev.  Then all other edges
       which might possibly represent canonical edge insertions are put in
       goodOr[nCanOr..nGoodOr-1] or goodInv[nCanInv..nGoodInv-1].
       The *Or edges are those for which the inserted edge will be in the
       mNext direction, and the *Inv edges .. the mPrev direction.
  
       In addition, if eDel is deleted, IN_MAX_FACE[newMaxList0..newMaxList1-1]
       will have all edges with a maximum face on the left (that size being put
       into newMaxFace).  This list may overlap
       IN_MAX_FACE[oldMaxList0..oldMaxList1-1] if the max face size does not
       increase.
  
       In the case of value 0, connectivity is changed to represent the new
       connectivity.
       Return values:   0 = ok
                        1 = rejected as connectivity will be too small
                        2 = rejected by colour
    */
  private int maybeDeleteBip(final Edge eDel, final int oldMaxFace, int oldMaxList0, final int oldMaxList1,
                             final MutableInteger newMaxFace, final MutableInteger newMaxList0, final MutableInteger newMaxList1,
                             final Edge[] goodOr, final MutableInteger nGoodOr, final MutableInteger nCanOr,
                             final Edge[] goodInv, final MutableInteger nGoodInv, final MutableInteger nCanInv, final MutableInteger connectivity) {

    final int maxface = eDel.mInverse.mLeftFaceSize + 2;
    newMaxFace.set(maxface);
    if (maxface > oldMaxFace) {
      oldMaxList0 = oldMaxList1;
    }
    newMaxList0.set(oldMaxList0);
    nGoodOr.set(0);
    nGoodInv.set(0);

    /* Now old edges that will be on a largest face (if *eDel is deleted)
    are in places oldMaxList0..oldMaxList1-1.  New edges will be from
    oldMaxList1 to *newMaxList1-1, but *newMaxList1 is not set yet. */
    final int v1 = eDel.mStart;
    final int v2 = eDel.mEnd;
    final int maxdeg;
    final int mindeg;
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
    final int v6 = e3.mEnd;
    final Edge e2 = eDel.mInverse.mNext;
    final int v5 = e2.mEnd;

   // The following is an efficiency short-cut, but it is assumed to have been done below.
    if (isNeqAdj(v3, v6) && (mDegree[v3] > maxdeg || mDegree[v6] > maxdeg)) {
      return 2;
    }
    if (isNeqAdj(v4, v5) && (mDegree[v4] > maxdeg || mDegree[v5] > maxdeg)) {
      return 2;
    }

    mDegree[v1]--;
    mDegree[v2]--;

    int ncOr = 0;
    int ncInv = 0;
    int maxcol = 0;
    if (mDegree[v1] == maxdeg) {
      int col = degendb(e1);
      maxcol = col;
      goodOr[ncOr++] = e1;
      if (maxface == 6) {
        col = degendb(e4);
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
      int col = degendb(e2);
      if (col > maxcol) {
        ncOr = ncInv = 0;
        goodInv[ncInv++] = e2;
        maxcol = col;
      } else if (col == maxcol) {
        goodInv[ncInv++] = e2;
      }
      if (maxface == 6) {
        col = degendb(e3);
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
    int nml1;

    if (maxface == 6) {
     // Recall from above that all degrees are <= maxdeg whenever edges are possible.
      final Edge e5 = e1.mInverse.mPrev;
      final Edge e6 = e3.mInverse.mPrev;
      if (isNeqAdj(v3, v6)) {
        if (mDegree[v3] == maxdeg) {
          if (mDegree[v1] > maxcol) {
            incDegree(v1, v2);
            return 2;
          } else if (mDegree[v1] == maxcol) {
            goodInv[ngInv++] = e1.mInverse;
          }
          if (mDegree[v5] > maxcol) {
            incDegree(v1, v2);
            return 2;
          } else if (mDegree[v5] == maxcol) {
            goodOr[ngOr++] = e5;
          }
        }

        if (mDegree[v6] == maxdeg) {
          if (mDegree[v4] > maxcol) {
            incDegree(v1, v2);
            return 2;
          } else if (mDegree[v4] == maxcol) {
            goodOr[ngOr++] = e6;
          }
          if (mDegree[v2] > maxcol) {
            incDegree(v1, v2);
            return 2;
          } else if (mDegree[v2] == maxcol) {
            goodInv[ngInv++] = e3.mInverse;
          }
        }
      }

      if (isNeqAdj(v4, v5)) {
        if (mDegree[v4] == maxdeg) {
          if (mDegree[v6] > maxcol) {
            incDegree(v1, v2);
            return 2;
          } else if (mDegree[v6] == maxcol) {
            goodInv[ngInv++] = e6.mInverse;
          }
          if (mDegree[v1] > maxcol) {
            incDegree(v1, v2);
            return 2;
          } else if (mDegree[v1] == maxcol) {
            goodOr[ngOr++] = e4.mInverse;
          }
        }

        if (mDegree[v5] == maxdeg) {
          if (mDegree[v2] > maxcol) {
            incDegree(v1, v2);
            return 2;
          } else if (mDegree[v2] == maxcol) {
            goodOr[ngOr++] = e2.mInverse;
          }
          if (mDegree[v3] > maxcol) {
            incDegree(v1, v2);
            return 2;
          } else if (mDegree[v3] == maxcol) {
            goodInv[ngInv++] = e5.mInverse;
          }
        }
      }

      nml1 = oldMaxList1;
      mInMaxFace[nml1++] = e1.mInverse;
      mInMaxFace[nml1++] = e2;
      mInMaxFace[nml1++] = e3.mInverse;
      mInMaxFace[nml1++] = e4;
      mInMaxFace[nml1++] = e5.mInverse;
      mInMaxFace[nml1++] = e6.mInverse;
    } else {
      // Recall from above that degree[v3,v6] <= maxdeg if v3 notadj v6 and degree[v4,v5] <= maxdeg if v4 notadj v5
      final Edge e5 = e1.mInverse.mPrev;
      if (isNeqAdj(v3, v6)) {
        if (mDegree[v3] == maxdeg) {
          if (mDegree[v5] > maxcol) {
            incDegree(v1, v2);
            return 2;
          } else if (mDegree[v5] == maxcol) {
            goodOr[ngOr++] = e5;
          }
        }
        if (mDegree[v6] == maxdeg) {
          if (mDegree[v2] > maxcol) {
            incDegree(v1, v2);
            return 2;
          } else if (mDegree[v2] == maxcol) {
            goodInv[ngInv++] = e3.mInverse;
          }
        }
      }
      if (isNeqAdj(v4, v5)) {
        if (mDegree[v5] == maxdeg) {
          if (mDegree[v3] > maxcol) {
            incDegree(v1, v2);
            return 2;
          } else if (mDegree[v3] == maxcol) {
            goodInv[ngInv++] = e5.mInverse;
          }
        }
        if (mDegree[v4] == maxdeg) {
          if (mDegree[v1] > maxcol) {
            incDegree(v1, v2);
            return 2;
          } else if (mDegree[v1] == maxcol) {
            goodOr[ngOr++] = e4.mInverse;
          }
        }
      }

      nml1 = oldMaxList1;
      Edge ea = e2;
      Edge eb = e3.mInverse.mPrev;
      do {
        if (isNeqAdj(ea.mEnd, eb.mEnd)) {
          final int da = degendb(ea);
          final int db = degendb(eb);
          if (da > maxdeg || db > maxdeg) {
            incDegree(v1, v2);
            return 2;
          }

          if (da == maxdeg) {
            if (mDegree[ea.mStart] > maxcol) {
              incDegree(v1, v2);
              return 2;
            } else if (mDegree[ea.mStart] == maxcol) {
              goodOr[ngOr++] = ea.mInverse;
            }
          }
          if (db == maxdeg) {
            if (mDegree[eb.mStart] > maxcol) {
              incDegree(v1, v2);
              return 2;
            } else if (mDegree[eb.mStart] == maxcol) {
              goodInv[ngInv++] = eb.mInverse;
            }
          }
        }
        mInMaxFace[nml1++] = ea;
        ea = eb.mNext;
        eb = eb.mInverse.mPrev;
        if (eb == eDel) {
          eb = e1;
        }
      } while (eb != e5);

      mInMaxFace[nml1++] = e5.mInverse;
      mInMaxFace[nml1++] = e1.mInverse;
      mInMaxFace[nml1++] = e4;
    }

    // Now test old edges still on max faces
    for (int i = oldMaxList0; i < oldMaxList1; ++i) {
      Edge ee = mInMaxFace[i];
      if (mDegree[ee.mStart] > maxdeg) {
        if (invokb(ee)) {
          incDegree(v1, v2);
          return 2;
        }
        ee = ee.mPrev;
        if (orokb(ee)) {
          incDegree(v1, v2);
          return 2;
        }
      } else if (mDegree[ee.mStart] == maxdeg) {
        int col = degendb(ee);
        if (col > maxcol) {
          if (invokb(ee)) {
            incDegree(v1, v2);
            return 2;
          }
        } else if (col == maxcol && invokb(ee)) {
          goodInv[ngInv++] = ee;
        }
        ee = ee.mPrev;
        col = degendb(ee);
        if (col > maxcol) {
          if (orokb(ee)) {
            incDegree(v1, v2);
            return 2;
          }
        } else if (col == maxcol && orokb(ee)) {
          goodOr[ngOr++] = ee;
        }
      }
    }

    final int newconnec;
    if (mindeg < connectivity.get()) {
      newconnec = mindeg;
    } else if (connectivity.get() == 3) {
      newconnec = 2 + threeconnQuad(eDel);
    } else if (connectivity.get() == 2) {
      newconnec = 1 + twoConnQuad(eDel);
    } else {
      newconnec = 1;
    }

    if (newconnec < mPlantri.getMinPolyConnectivity()) {
      incDegree(v1, v2);
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

    maxcol = 0;
    for (int i = 0; i < ncOr; ++i) {
      if (orcolb(goodOr[i]) > maxcol) {
        maxcol = orcolb(goodOr[i]);
      }
    }
    for (int i = 0; i < ncInv; ++i) {
      if (invcolb(goodInv[i]) > maxcol) {
        maxcol = invcolb(goodInv[i]);
      }
    }

    int k, i;
    for (i = 0, k = 0; i < ncOr; ++i) {
      if (orcolb(goodOr[i]) == maxcol) {
        goodOr[k++] = goodOr[i];
      }
    }
    nCanOr.set(k);
    for (; i < ngOr; ++i) {
      final int col = orcolb(goodOr[i]);
      if (col == maxcol) {
        goodOr[k++] = goodOr[i];
      } else if (col > maxcol) {
        insertEdgeGeneral(eDel);
        nGoodOr.set(0);
        nGoodInv.set(0);
        return 2;
      }
    }
    nGoodOr.set(k);

    for (i = 0, k = 0; i < ncInv; ++i) {
      if (invcolb(goodInv[i]) == maxcol) {
        goodInv[k++] = goodInv[i];
      }
    }
    nCanInv.set(k);
    for (; i < ngInv; ++i) {
      final int col = invcolb(goodInv[i]);
      if (col == maxcol) {
        goodInv[k++] = goodInv[i];
      } else if (col > maxcol) {
        insertEdgeGeneral(eDel);
        nGoodOr.set(0);
        nGoodInv.set(0);
        return 2;
      }
    }
    nGoodInv.set(k);
    return 0;
  }

  private void amAddEdge(final int i, final int j) {
    mAdjMat[i][j] = mAdjMat[j][i] = 1;
  }

  private void amDelEdge(final int i, final int j) {
    mAdjMat[i][j] = mAdjMat[j][i] = 0;
  }

  /* This is the recursive search procedure for bipartite graphs.
     * oldFeas[0..nOldFeas-1] are the edges which can be removed without
     * violating the degree bound mMinPolyDeg, with some (but not necessarily
     * all) missing because they are known to violate the connectivity
     * bound mMinPolyConnec.  nbtot/nbop represent the group, as usual.
     * oldMaxFace is the size of the largest face.
     * IN_MAX_FACE[oldMaxList0..oldMaxList1-1] lists the edges whose
     * left face has greatest size (unless that is 4).  connectivity is
     * the actual connectivity.
     */
  void scan(final int nbtot, final int nbop, final Edge[] oldFeas, int nOldFeas,
            final int oldMaxFace, final int oldMaxList0, final int oldMaxList1, final int connectivity) {
    if (mState.mNumEdges <= mEdgeBounds[1]) {
      mPlantri.gotOne(nbtot, nbop, connectivity);
    }
    if (mState.mNumEdges == mEdgeBounds[0]) {
      return;
    }
    if (mState.mNumEdges - 2 * nOldFeas > mEdgeBounds[1]) {
      return;
    }

    final int[] minimal = new int[Plantri.MAX_EDGES / 2];
    mPlantri.markEdgeOrbits(oldFeas, nOldFeas, minimal, nbtot);

    final Edge[] newfeas = new Edge[Plantri.MAX_EDGES / 2];
    final Edge[] goodOr = new Edge[Plantri.MAX_EDGES];
    final Edge[] goodInv = new Edge[Plantri.MAX_EDGES];
    final MutableInteger newmaxface = new MutableInteger();
    final MutableInteger xnbtot = new MutableInteger();
    final MutableInteger xnbop = new MutableInteger();
    final MutableInteger ngoodOr = new MutableInteger();
    final MutableInteger ncanOr = new MutableInteger();
    final MutableInteger ngoodInv = new MutableInteger();
    final MutableInteger ncanInv = new MutableInteger();
    final MutableInteger newmaxlist0 = new MutableInteger();
    final MutableInteger newmaxlist1 = new MutableInteger();
    final MutableInteger newconnec = new MutableInteger();

    for (int i = 0; i < nOldFeas; ++i) {
      if (minimal[i] == 0) {
        continue;
      }

      Edge e = oldFeas[i];
      if (e.mLeftFaceSize != 4) {
        e = e.mInverse;
      }
      if (e.mInverse.mLeftFaceSize < oldMaxFace - 2 || e.mInverse.mLeftFaceSize == mMaxFaceSize) {
        continue;
      }

      amDelEdge(e.mStart, e.mEnd);

      newconnec.set(connectivity);
      final int code = maybeDeleteBip(e, oldMaxFace, oldMaxList0, oldMaxList1, newmaxface, newmaxlist0, newmaxlist1,
        goodOr, ngoodOr, ncanOr, goodInv, ngoodInv, ncanInv, newconnec);

      if (code == 0) {
        if (ngoodOr.get() + ngoodInv.get() == 1) {
          final Edge esave = oldFeas[i];
          oldFeas[i] = oldFeas[nOldFeas - 1];
          final int nnewfeas = pruneBipEdgelist(oldFeas, nOldFeas - 1, newfeas);
          oldFeas[i] = esave;
          scan(1, 1, newfeas, nnewfeas, newmaxface.get(), newmaxlist0.get(), newmaxlist1.get(), newconnec.get());
        } else if (Canon.canonEdgeOriented(mPlantri, goodOr, ngoodOr.get(), ncanOr.get(), goodInv, ngoodInv.get(), ncanInv.get(), mDegree, mNumbering, xnbtot, xnbop)) {
          /* The following line corrects for the fact that canon*()
             finds each automorphism twice if the maximum degree is
             at most 2.  However, it interferes with -o so is disabled.
             CHECK THIS
             
             if (mState.mNumEdges <= 2*mState.mNumVertices && maxdegree() <= 2) xnbtot = xnbop; */

          final Edge esave = oldFeas[i];
          oldFeas[i] = oldFeas[nOldFeas - 1];
          final int nnewfeas = pruneBipEdgelist(oldFeas, nOldFeas - 1, newfeas);
          oldFeas[i] = esave;
          scan(xnbtot.get(), xnbop.get(), newfeas, nnewfeas, newmaxface.get(), newmaxlist0.get(), newmaxlist1.get(), newconnec.get());
        }
        insertEdgeGeneral(e);
      } else if (code == 1) {
        oldFeas[i] = oldFeas[--nOldFeas];
        minimal[i--] = minimal[nOldFeas];
      }
      amAddEdge(e.mStart, e.mEnd);
    }
  }
}

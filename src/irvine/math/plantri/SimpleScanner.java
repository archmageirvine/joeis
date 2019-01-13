package irvine.math.plantri;

import irvine.math.MutableInteger;

/**
 * The main node of the recursion for triangulations without double edges or loops.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
class SimpleScanner {

  private final Plantri mPlantri;
  private final DoubleScanner mDoubleScanner;
  private final PlantriGraphState mState;
  private final int[] mDegree;
  private final Edge[] mFirstEdge;
  private final Numbering mNumbering;
  private final Marks mVertexMarks;
  private final ExtensionFinder mFinder;
  // Holds numberings produced by canon() or canonEdge()
  private final Numbering mSavedNumbering;
  final ExtenderReducer mDeg3;
  private final ExtenderReducerWithSave mDeg4;
  private final ExtenderReducerWithSave mDeg5;
  private final boolean mNeedGroup;

  /* If mCodeEdge is not null, it is taken as the start for coding for
   ASCII or planar_code. Otherwise mFirstEdge.get() is the mStart. This
   method implies comparatively few changes due to outputting
   triangulations of disks.

   In case of triangulations of disks, *mCodeEdge should be an edge
   with the "outer" face on the left for the non-mirror case and on
   the right for the mirror case to have the outer face left of 1.2.

   In case of dual output (mirror image or not), the face on the left
   of *mCodeEdge gets the number 1. So for duals of triangulations of
   disks, handing in an edge with the disk on the right outputs the
   "marked" vertex as 1.
  */
  private Edge mCodeEdge = null;
  private int mOutsideFaceSize;  // Used for polygon triangulations.


  SimpleScanner(final Plantri plantri, final Numbering numbering, final Marks vertexMarks, final boolean needGroup) {
    mPlantri = plantri;
    mDoubleScanner = new DoubleScanner(plantri, numbering, vertexMarks);
    mState = plantri.getState();
    mDegree = mState.mDegree;
    mFirstEdge = mState.mFirstEdge;
    mNumbering = numbering;
    mVertexMarks = vertexMarks;
    mFinder = new ExtensionFinder(mState, mNumbering, plantri.mEdgeFactory);
    mDeg3 = new Degree3ExtenderReducer(mState);
    mDeg4 = new Degree4ExtenderReducer(mState);
    mDeg5 = new Degree5ExtenderReducer(mState);
    mNeedGroup = needGroup;
    mSavedNumbering = new Numbering(Plantri.MAX_EDGES, plantri.mEdgeFactory);
  }

  int getOutsideFaceSize() {
    return mOutsideFaceSize;
  }

  /* Checks whether a triangulation of a disk is 3-connected. This is
     the case if and only if there are no chords (except for K3).
     The edge e must have the triangulation on the right and the outer
     face on the left.
     Returns true if 3-connected, false otherwise.
   */
  private boolean diskThreeConn(final Edge e) {
    if (mState.mNumVertices == 3) {
      return false; // K3 has connectivity 2
    }

    mVertexMarks.resetMarksVertex();

    /* It is correct to do the marking and the running and checking in one
       wash, since a chord will be detected when the second of the endpoints
       is reached
    */
    mVertexMarks.markVertex(e.mStart);
    mVertexMarks.markVertex(e.mEnd);

    for (Edge buffer = e.mInverse, run = buffer.mNext; run != e; buffer = run.mInverse, run = buffer.mNext) {
      mVertexMarks.markVertex(run.mEnd);
      for (Edge run2 = run.mNext; run2 != buffer; run2 = run2.mNext) {
        if (mVertexMarks.isMarkedVertex(run2.mEnd)) {
          return false;
        }
      }
    }
    return true;
  }

  /* Removes vertex i from the graph and returns an edge with the
     new face on the left. Note that afterwards the vertices are
     in general no more numbered 0...mState.mNumVertices-1, but maybe
     e.g. 0...mState.mNumVertices with some number in the middle missing.
  */
  private Edge removeVertex(final int i) {
    mState.mNumVertices--;
    mState.mNumEdges -= 2 * mDegree[i];

    final Edge end = mFirstEdge[i];
    Edge run = end;
    Edge buffer;
    do {
      buffer = run.mInverse;
      buffer.mPrev.mNext = buffer.mNext;
      buffer.mNext.mPrev = buffer.mPrev;
      mDegree[buffer.mStart]--;
      mFirstEdge[buffer.mStart] = buffer.mNext;
      run = run.mNext;
    } while (run != end);

    //sMissingVertex = i;
    mOutsideFaceSize = mDegree[i];
    return buffer.mNext;
  }


  /* Inserts the previously removed vertex */
  private void insertVertex(final int i) {
    mState.mNumVertices++;
    mState.mNumEdges += 2 * mDegree[i];

    final Edge end = mFirstEdge[i];
    Edge run = end;
    do {
      final Edge buffer = run.mInverse;
      buffer.mPrev.mNext = buffer;
      buffer.mNext.mPrev = buffer;
      mDegree[buffer.mStart]++;
      run = run.mNext;
    } while (run != end);

    //sMissingVertex = -1;
  }


  private boolean[] getTriangVMarks() {
    final boolean[] vmark = new boolean[Plantri.MAX_VERTICES];
    for (int v = 0; v < mState.mNumVertices; ++v) {
      vmark[v] = mPlantri.mPolygonSize <= 0 || mDegree[v] == mPlantri.mPolygonSize;
    }
    return vmark;
  }

  private void polygonTriangTrivial(final boolean[] vmark) {
    for (int v = 0; v < mState.mNumVertices; ++v) {
      if (vmark[v]) {
        mCodeEdge = removeVertex(v);
        int connec = 2;
        if (mDegree[v] == 3) {
          connec = 3;
        } else if (mPlantri.getMinConnectivity() == 3 || mPlantri.mExactSwitch) {
          connec += diskThreeConn(mCodeEdge) ? 1 : 0;
        }
        if (connec >= mPlantri.getMinConnectivity()) {
          mPlantri.gotOne(1, 1, connec);
        }
        insertVertex(v);
        mCodeEdge = null;
      }
    }
  }

  private void polyTriangNontrivial(final boolean[] vmark, final int nbTot, final int nbOp) {
    final int numEdges = mState.mNumEdges;
    for (int k = 0; k < nbTot; ++k) {
      System.arraycopy(mNumbering.get(k), 0, mSavedNumbering.get(k), 0, numEdges);
    }

    for (int k = 0; k < numEdges; ++k) {
      final int v = mSavedNumbering.get(0, k).mStart;
      if (!vmark[v]) {
        continue;
      }

      int newNbtot = 0;
      int newNbop = 0;
      for (int i = 0; i < nbTot; ++i) {
        final Edge e = mSavedNumbering.get(i, k);
        vmark[e.mStart] = false;
        if (e.mStart == v) {
          for (int j0 = 0, j1 = 0; j1 < numEdges; ++j1) {
            if (mSavedNumbering.get(i, j1).mStart != v && mSavedNumbering.get(i, j1).mEnd != v) {
              mNumbering.set(newNbtot, j0++, mSavedNumbering.get(i, j1));
            }
          }
          if (i < nbOp) {
            ++newNbop;
          }
          ++newNbtot;
        }
      }
      mCodeEdge = removeVertex(v);

      int connec = 2;
      if (mDegree[v] == 3 && mState.mNumVertices > 3) {
        connec = 3;
      } else if (mPlantri.getMinConnectivity() == 3 || mPlantri.mExactSwitch) {
        connec += diskThreeConn(mCodeEdge) ? 1 : 0;
      }

      if (connec >= mPlantri.getMinConnectivity()) {
        mPlantri.gotOne(newNbtot, newNbop, connec);
      }
      insertVertex(v);
      mCodeEdge = null;
    }
  }

  /* This routine receives a 3-conn triangulation with one more vertex
     than the output size.  It then makes the polygon triangulations by
     removing inequivalent vertices of the required degree. */
  private void polygonTriang(final int nbTot, final int nbOp) {
    final boolean[] vmark = getTriangVMarks();

    if (mPlantri.getMinDegree() == 3 || mPlantri.getMinConnectivity() == 3) {
      for (int v = 0; v < mState.mNumVertices; ++v) {
        if (mDegree[v] == 3) {
          final Edge ev = mFirstEdge[v];
          vmark[ev.mEnd] = false;
          vmark[ev.mNext.mEnd] = false;
          vmark[ev.mPrev.mEnd] = false;
        }
      }
    }

    if (nbTot == 1) {
      // Case of trivial group
      polygonTriangTrivial(vmark);
    } else {
      // Case of non-trivial group
      polyTriangNontrivial(vmark, nbTot, nbOp);
    }
  }


  /* The main node of the recursion for triangulations without double
     edges or loops.  As this procedure is entered,
     mState.mNumVertices,mState.mNumEdges,degree etc are set for some graph, and nbTot/nbOp are the
     values returned by canon() for that graph. */
  void scan(final int nbTot, final int nbOp) {
    if (mState.mNumVertices == mPlantri.mMaxNV) {
      if (mPlantri.mPolytopeSwitch) {
        mPlantri.startPolyScan(nbTot, nbOp, mNeedGroup);
      } else if (mPlantri.mPolygonSize >= 0) {
        polygonTriang(nbTot, nbOp);
      } else if (mPlantri.getMinConnectivity() == 3) {
        mPlantri.gotOne(nbTot, nbOp, 3);
      } else {
        mDoubleScanner.scan(nbTot, nbOp, 0, null, null, 0, null);
      }
      return;
    }

    final Edge[] firstEdgeSave = mPlantri.hasNoUsefulSplit(mState.mNumVertices == mPlantri.mSplitLevel);
    if (firstEdgeSave == null) {
      return;
    }

    // The following could be improved significantly by avoiding extensions that can't lead to success here.
    if (mPlantri.mPolygonSize >= 9) {
      final int neededDeg = mPlantri.mPolygonSize + mState.mNumVertices - mPlantri.mMaxNV;
      int i;
      for (i = 0; i < mState.mNumVertices; ++i) {
        if (mDegree[i] >= neededDeg) {
          break;
        }
      }
      if (i == mState.mNumVertices) {
        return;
      }
    }

    final Edge[] ext3 = new Edge[Plantri.MAX_EDGES / 3];
    final Edge[] ext4 = new Edge[Plantri.MAX_EDGES / 2];
    final Edge[] ext5 = new Edge[Plantri.MAX_EDGES];
    final MutableInteger next3 = new MutableInteger();
    final MutableInteger next4 = new MutableInteger();
    final MutableInteger next5 = new MutableInteger();
    final MutableInteger xnbTot = new MutableInteger();
    final MutableInteger xnbOp = new MutableInteger();
    final int[] colour = new int[Plantri.MAX_VERTICES];
    mFinder.findExtensions(nbTot, nbOp, ext3, next3, ext4, next4, ext5, next5);

    for (int i = 0; i < next3.get(); ++i) {
      final int nc = VertexColour.makeColours(mState, colour, ext3[i]);
      if (nc != 0) {
        mDeg3.extend(ext3[i]);
        if (nc == 1 && mState.mNumVertices == mPlantri.mMaxNV && !mNeedGroup) {
          mPlantri.gotOne(1, 1, 3);
        } else if (Canon.canon(mPlantri, mFirstEdge, colour, mNumbering, xnbTot, xnbOp)) {
          scan(xnbTot.get(), xnbOp.get());
        }
        mDeg3.reduce(ext3[i]);
      }
    }

    final Edge[] saveList = new Edge[4];
    for (int i = 0; i < next4.get(); ++i) {
      mDeg4.extend(ext4[i], saveList);
      if (Canon.canon(mPlantri, mFirstEdge, mDegree, mNumbering, xnbTot, xnbOp)) {
        Edge e = mNumbering.get(0, 0);
        final int v = e.mNext.mNext.mEnd;
        final Edge ex = e.mInverse;
        for (e = ex.mNext; e != ex; e = e.mNext) {
          if (e.mEnd == v) {
            break;
          }
        }

        Edge e1 = ext4[i].mNext.mInverse;
        if (e != ex) {
          e1 = e1.mNext;
        }

        final Edge e2 = e1.mNext.mNext;
        final int nblim = xnbTot.get();
        final int nb = mNumbering.findEdgeNumber(e1, e2, nblim);
        if (nb < nblim) {
          scan(xnbTot.get(), xnbOp.get());
        }
      }
      mDeg4.reduce(ext4[i], saveList);
    }

    for (int i = 0; i < next5.get(); ++i) {
      mDeg5.extend(ext5[i], saveList);
      if (Canon.canon(mPlantri, mFirstEdge, mDegree, mNumbering, xnbTot, xnbOp)) {
        final Edge e1 = ext5[i].mNext.mInverse;
        Edge e2 = mNumbering.get(0, 0);
        if (xnbTot.get() == 1) {
          if (!e2.isValid5Edge()) {
            if (xnbOp.get() == 1) {
              e2 = e2.mPrev.isValid5Edge() ? e2.mPrev : e2.mNext;
            } else {
              e2 = e2.mNext.isValid5Edge() ? e2.mNext : e2.mPrev;
            }
          }
          if (e2 == e1) {
            scan(xnbTot.get(), xnbOp.get());
          }
        } else {
          final int nblim = xnbTot.get();
          final int nb = mNumbering.findEdgeNumber(e1, nblim);
          if (nb < nblim) {
            scan(xnbTot.get(), xnbOp.get());
          }
        }
      }
      mDeg5.reduce(ext5[i], saveList);
    }

    if (mState.mNumVertices == mPlantri.mSplitLevel) {
      System.arraycopy(firstEdgeSave, 0, mFirstEdge, 0, mState.mNumVertices);
    }
  }
}

package irvine.math.plantri;

import irvine.math.MutableInteger;

/**
 * Routines for pruning.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
final class Pruner {

  private Pruner() { }

  private static int pruneOr(final int[] degree, final Edge e) {
    return (degree[e.mInverse.mPrev.mPrev.mEnd] << 10) + degree[e.mNext.mInverse.mPrev.mEnd];
  }

  private static int pruneMir(final int[] degree, final Edge e) {
    return (degree[e.mInverse.mNext.mNext.mEnd] << 10) + degree[e.mPrev.mInverse.mNext.mEnd];
  }

  private static void pruneOrientedList(final Edge[] good, final MutableInteger nGood, final MutableInteger nGoodRef, final long[] code, final long maxCode) {
    int k = 0;
    int kref = 0;
    for (int i = 0; i < nGood.get(); ++i) {
      if (code[i] == maxCode) {
        if (i < nGoodRef.get()) {
          ++kref;
        }
        good[k++] = good[i];
      }
    }
    nGood.set(k);
    nGoodRef.set(kref);
  }

  /* Try to prune the edge lists (of the form required by
     canonEdgeOriented()) by using the degrees of a couple of
     extra vertices.  The result is returned in the same form.
     As always, if *nGoodRef==*nGoodMirRef==0 on output
     (which must not be true on input), all else is undefined.
    */
  static void pruneOrientedLists(final Edge[] goodOr, final MutableInteger nGoodOr, final MutableInteger nGoodRef,
                                 final Edge[] goodMir, final MutableInteger nGoodMir, final MutableInteger nGoodMirRef, final int[] degree) {
    final long[] codeOr = new long[Plantri.MAX_EDGES];
    final long[] codeMir = new long[Plantri.MAX_EDGES];
    long maxCode = 0;
    for (int i = 0; i < nGoodOr.get(); ++i) {
      codeOr[i] = pruneOr(degree, goodOr[i]);
      if (codeOr[i] > maxCode) {
        maxCode = codeOr[i];
      }
    }
    for (int i = 0; i < nGoodMir.get(); ++i) {
      codeMir[i] = pruneMir(degree, goodMir[i]);
      if (codeMir[i] > maxCode) {
        maxCode = codeMir[i];
      }
    }

    pruneOrientedList(goodOr, nGoodOr, nGoodRef, codeOr, maxCode);
    pruneOrientedList(goodMir, nGoodMir, nGoodMirRef, codeMir, maxCode);
  }

}

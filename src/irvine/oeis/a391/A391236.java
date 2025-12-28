package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.ParallelPermutationSequence;
import irvine.oeis.Sequence1;

/**
 * A391236 allocated for Donghwi Park.
 * @author Sean A. Irvine
 */
public class A391236 extends Sequence1 {

  // Has newly completed triangles and hexagons for a given exclusive position.
  // These are cumulative by n
  // This could be extended but is already too slow for n=5
  private static final int[][] COMPLETIONS = {
    // For n == 1
    /*  0 */ {},
    /*  1 */ {},
    /*  2 */ {},
    /*  3 */ {0, 1, 2},
    // For n == 2
    /*  4 */ {},
    /*  5 */ {},
    /*  6 */ {3, 4, 5},
    /*  7 */ {},
    /*  8 */ {1, 2, 3, 5, 6, 7},
    /*  9 */ {6, 7, 8},
    // For n == 3
    /* 10 */ {},
    /* 11 */ {},
    /* 12 */ {9, 10, 11},
    /* 13 */ {5, 7, 12},
    /* 14 */ {4, 5, 8, 11, 12, 13},
    /* 15 */ {12, 13, 14},
    /* 16 */ {},
    /* 17 */ {7, 8, 12, 14, 15, 16},
    /* 18 */ {15, 16, 17},
    // For n == 4
    /* 19 */ {},
    /* 20 */ {},
    /* 21 */ {18, 19, 20},
    /* 22 */ {11, 13, 21},
    /* 23 */ {10, 11, 18, 20, 21, 22},
    /* 24 */ {21, 22, 23},
    /* 25 */ {14, 16, 24},
    /* 26 */ {13, 14, 21, 23, 24, 25},
    /* 27 */ {24, 25, 26},
    /* 28 */ {},
    /* 29 */ {16, 17, 24, 26, 27, 28},
    /* 30 */ {27, 28, 29},
    // For n == 5
    /* 31 */ {},
    /* 32 */ {},
    /* 33 */ {30, 31, 32},
    /* 34 */ {20, 22, 33},
    /* 35 */ {19, 20, 30, 32, 33, 34},
    /* 36 */ {33, 34, 35},
    /* 37 */ {23, 25, 36},
    /* 38 */ {22, 23, 33, 35, 36, 37},
    /* 39 */ {36, 37, 38},
    /* 40 */ {26, 28, 39},
    /* 41 */ {25, 26, 36, 38, 39, 40},
    /* 42 */ {39, 40, 41},
    /* 43 */ {},
    /* 44 */ {28, 29, 39, 41, 42, 43},
    /* 45 */ {42, 43, 44},
  };

  private int mN = 0;

  private int nodes(final int n) {
    return 3 * n  * (n + 1) / 2;
  }

  private int triangle(final int n) {
    return (9 * n  * (n + 1)  + 6) / 4 - 3;
  }

  private int hexagon(final int n) {
    return (9 * n  * (n + 1)  + 6) / 2 - 6;
  }

  private final ParallelPermutationSequence[] mSearchers = {
    null,
    new ParallelPermutationSequence(nodes(1)) {
      @Override
      protected boolean accept(final int[] p, final int sum, final int pos) {
        switch (pos) {
          case 2:
            return p[0] > p[1];
          case 3:
            return p[0] > p[2] && p[1] > p[2];
          default:
            return true;
        }
      }
    },
    new ParallelPermutationSequence(nodes(2)) {
      private final int mTriangle = triangle(2);
      private final int mHexagon = hexagon(2);

      @Override
      protected boolean accept(final int[] p, final int sum, final int pos) {
        if (pos == 3) {
          // Enforce left-right symmetry
          if (p[1] < p[2]) {
            return false;
          }
        }
        if (pos == 5 && p[4] > p[0]) {
          return false;
        }
        if (pos == 9 && p[8] > p[0]) {
          return false;
        }
        int magic = 0;
        for (final int v : COMPLETIONS[pos]) {
          magic += p[v];
        }
        if (COMPLETIONS[pos].length == 3 && magic != mTriangle) {
          return false;
        }
        if (COMPLETIONS[pos].length == 6 && magic != mHexagon) {
          return false;
        }
        return true;
      }
    },
    null,
    null,
    new ParallelPermutationSequence(nodes(5)) {
      private final int mTriangle = triangle(5);
      private final int mHexagon = hexagon(5);

      @Override
      protected boolean accept(final int[] p, final int sum, final int pos) {
        if (pos == 3) {
          // Enforce left-right symmetry
          if (p[1] < p[2]) {
            return false;
          }
        }
        if (pos == 32 && p[31] > p[0]) {
          return false;
        }
        if (pos == 45 && p[44] > p[0]) {
          return false;
        }
        int magic = 0;
        for (final int v : COMPLETIONS[pos]) {
          magic += p[v];
        }
        if (COMPLETIONS[pos].length == 3 && magic != mTriangle) {
          return false;
        }
        if (COMPLETIONS[pos].length == 6 && magic != mHexagon) {
          return false;
        }
        return true;
      }
    },
  };

  @Override
  public Z next() {
    final ParallelPermutationSequence gen = mSearchers[++mN];
    if (gen == null) {
      return Z.ZERO;
    }
    return gen.next();
  }
}

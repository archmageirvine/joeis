package irvine.oeis.a232;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A232476 Number of h-vectors of length n; equivalently, number of M-sequences of length n.
 * @author Sean A. Irvine
 */
public class A232476 extends Sequence1 {

  // After Francesca Cioffi
  // https://www.dma.unina.it/~cioffi/MaterialeOsequences/IterativeFormulaOSequences.CoCoA5

  private int mD = 0;

  // A more direct implementation of the recurrence
//  private MemoryFunctionInt4<Z> mO = new MemoryFunctionInt4<>() {
//    @Override
//    protected Z compute(final int p, final int n, final int k, final int d) {
//      if (p == 1) {
//        if (k == d - 1 && n >= d - 1) {
//          return Z.ONE;
//        }
//        return Z.ZERO;
//      }
//      if (k == 0) {
//        return Integers.SINGLETON.sum(0, d - 1, j -> get(p - 1, n, j, d));
//      }
//      Z sum = Z.ZERO;
//      for (int j = 1; j < d; ++j) {
//        for (int i = k; i <= n; ++i) {
//          sum = sum.add(get(p - 1, n, i, d - j).multiply(get(p, i - 1, k - 1, j)));
//        }
//      }
//      return sum;
//    }
//  };

  protected Z o(final int bigP, final int bigN, final int bigK, final int bigD) {
    if (bigP < 1 || bigK < 0 || bigD < 1 || bigK >= bigD || bigK > bigN) {
      return Z.ZERO;
    }
    final Z[][][][] os = new Z[2][bigN + 1][bigD + 1][bigD + 1];
    for (int t = 0; t < os.length; ++t) {
      for (int n = 0; n < os[t].length; ++n) {
        for (int k = 0; k < os[t][n].length; ++k) {
          Arrays.fill(os[t][n][k], Z.ZERO);
        }
      }
    }

    int ind = 0;
    int ind1 = 1;

    // Base induction bigP=1
    for (int d = 1; d <= bigD; ++d) {
      for (int n = d - 1; n <= bigN; ++n) {
        os[ind][n][d][d] = Z.ONE;
      }
    }

    // Recursion on bigP
    for (int p = 2; p <= bigP; ++p) {
      final int tmp = ind;
      ind = ind1;
      ind1 = tmp;

      // clear new layer
      for (int n = 0; n <= bigN; ++n) {
        for (int k = 0; k <= bigN; ++k) {
          Arrays.fill(os[ind][n][k], Z.ZERO);
        }
      }

      // bigK = 0
      for (int d = 1; d <= bigD; ++d) {
        for (int n = 0; n <= bigN; ++n) {
          Z sum = Z.ZERO;
          for (int h = 0; h <= n; ++h) {
            sum = sum.add(os[ind1][n][h + 1][d]);
          }
          os[ind][n][1][d] = sum;
        }
      }

      // bigK > 0
      for (int k = 1; k <= bigN; ++k) {
        for (int d = k + 1; d <= bigD; ++d) {
          for (int n = k; n <= bigN; ++n) {
            Z sum = Z.ZERO;
            for (int j = 1; j <= d - 1; ++j) {
              for (int i = k; i <= bigN; ++i) {
                sum = sum.add(os[ind1][n][i + 1][d - j].multiply(os[ind][i - 1][k][j]));
              }
            }
            os[ind][n][k + 1][d] = sum;
          }
        }
      }
    }
    return os[ind][bigN][bigK + 1][bigD];
  }

  @Override
  public Z next() {
    ++mD;
    //return mO.get(mD, mD - 1, 0, mD);
    return o(mD, mD - 1, 0, mD);
  }
}

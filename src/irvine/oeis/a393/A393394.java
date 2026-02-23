package irvine.oeis.a393;

import irvine.oeis.ParallelPermutationSequence;

/**
 * A393394 allocated for Vincent Vatter.
 * @author Sean A. Irvine
 */
public class A393394 extends ParallelPermutationSequence {

  /** Construct the sequence. */
  public A393394() {
    super(0);
  }

  public static boolean avoids2413and3142UpTo(final int[] p, final int pos) {
    final int x = p[pos];

    for (int i = 0; i < pos; ++i) {
      for (int j = i + 1; j < pos; ++j) {
        // We will scan k > j
        int minAfterJ = Integer.MAX_VALUE;
        int maxAfterJ = Integer.MIN_VALUE;

        for (int k = j + 1; k < pos; ++k) {
          final int pk = p[k];

          // For 2413: p[k] < p[i] < x < p[j]
          minAfterJ = Math.min(minAfterJ, pk);
          if (minAfterJ < p[i] && p[i] < x && x < p[j]) {
            return false;
          }

          // For 3142: p[j] < x < p[i] < p[k]
          maxAfterJ = Math.max(maxAfterJ, pk);
          if (p[j] < x && x < p[i] && p[i] < maxAfterJ) {
            return false;
          }
        }
      }
    }
    return true;
  }

  @Override
  protected boolean accept(final int[] p, final int sum, final int pos) {
    if (pos == 0) {
      return true;
    }
    if (p[pos - 1] == pos - 1) {
      return false;
    }
    if (pos < 4) {
      return true;
    }
    return avoids2413and3142UpTo(p, pos - 1);

//    final int pd = p[pos - 1];
//    for (int a = 0; a < pos - 3; ++a) {
//      for (int b = a + 1; b < pos - 2; ++b) {
//        for (int c = b + 1; c < pos - 1; ++c) {
//          if (p[c] < p[a] && p[a] < pd && pd < p[b]) {
//            return false;
//          }
//          if (p[b] < pd && pd < p[a] && p[a] < p[c]) {
//            return false;
//          }
//        }
//      }
//    }
//    return true;
  }

//  @Override
//  protected long count(final int[] p) {
//    System.out.println(Arrays.toString(p));
//    return super.count(p);
//  }
}

package irvine.oeis.a393;

import java.util.HashMap;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393584 a(n) is the minimum, over all partitions {X, Y} of {1..2n} with |X| = |Y|, of the maximum number of pairs (x, y) with the same difference x - y for x in X and y in Y.
 * @author Sean A. Irvine
 */
public class A393584 extends Sequence1 {

  private int mN = 0;

  private int cappedMax(final Z x, final int m, final int min) {
    int max = 0;
    final HashMap<Integer, Integer> counts = new HashMap<>();
    for (int k = 0; k < m; ++k) {
      if (x.testBit(k)) {
        for (int j = 0; j < m; ++j) {
          if (!x.testBit(j)) {
            final int v = counts.merge(k - j, 1, Integer::sum);
            if (v > min) {
              return v; // abort computation, we already exceeded current minimum
            }
            if (v > max) {
              max = v;
            }
          }
        }
      }
    }
    return max;
  }

  @Override
  public Z next() {
    final int m = 2 * ++mN;
    final Z lim = Z.ONE.shiftLeft(m - 1);
    int min = m;
    for (Z x = Z.ONE.shiftLeft(mN).subtract(1); x.compareTo(lim) < 0; x = Functions.SWIZZLE.z(x)) {
      final int max = cappedMax(x.multiply2(), m, min); // WLOG assume 1 is in Y
      if (max < min) {
        min = max;
      }
    }
    return Z.valueOf(min);
  }
}

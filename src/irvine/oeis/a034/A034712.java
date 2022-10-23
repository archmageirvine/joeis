package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034712 Largest number using only digits &lt;= n that does not repeat a pair of consecutive digits.
 * @author Sean A. Irvine
 */
public class A034712 extends Sequence1 {

  private int mN = 1;

  @Override
  public Z next() {
    final boolean[] seenPairs = new boolean[++mN * mN];
    final int[] digits = new int[mN * mN + 1];
    if (!A034711.search(seenPairs, digits, 0, mN)) {
      throw new RuntimeException();
    }
    Z res = Z.ZERO;
    for (final int d : digits) {
      res = res.multiply(10).add(d);
    }
    return res;
  }
}

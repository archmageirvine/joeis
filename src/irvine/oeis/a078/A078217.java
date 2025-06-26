package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078217 Smallest multiple of n that begins with the concatenation of the positive integers &lt;= n and coprime to n (in increasing order).
 * @author Sean A. Irvine
 */
public class A078217 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    for (long k = 1; k <= mN; ++k) {
      if (Functions.GCD.l(k, mN) == 1) {
        sb.append(k);
      }
    }
    final Z concat = new Z(sb);
    Z lo = concat;
    if (lo.mod(mN) == 0) {
      return lo;
    }
    Z hi = concat.add(1);
    while (true) {
      lo = lo.multiply(10);
      if (lo.mod(mN) == 0) {
        return lo;
      }
      hi = hi.multiply(10);
      final Z t = lo.add(mN - lo.mod(mN));
      if (t.compareTo(hi) < 0) {
        return t;
      }
    }
  }
}


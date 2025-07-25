package irvine.oeis.a078;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078218 Smallest multiple of n that begins with the concatenation of the divisors of n (in increasing order).
 * @author Sean A. Irvine
 */
public class A078218 extends Sequence1 {

  protected long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    for (final Z d : Jaguar.factor(mN).divisorsSorted()) {
      sb.append(d);
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


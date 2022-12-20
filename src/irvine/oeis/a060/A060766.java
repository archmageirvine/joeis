package irvine.oeis.a060;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A060766 Least common multiple of differences between consecutive divisors of n (ordered by size).
 * @author Sean A. Irvine
 */
public class A060766 extends Sequence2 {

  protected long mN = 1;

  static Z lcmDelta(final Z... t) {
    Z lcm = Z.ONE;
    Z prev = null;
    for (final Z v : t) {
      if (prev != null) {
        lcm = lcm.lcm(v.subtract(prev));
      }
      prev = v;
    }
    return lcm;
  }

  @Override
  public Z next() {
    return lcmDelta(Jaguar.factor(++mN).divisorsSorted());
  }
}

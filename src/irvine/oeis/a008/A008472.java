package irvine.oeis.a008;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008472 Sum of the distinct primes dividing <code>n</code>.
 * @author Sean A. Irvine
 */
public class A008472 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    if (++mN > 1) {
      for (final Z p : Cheetah.factor(mN).toZArray()) {
        sum = sum.add(p);
      }
    }
    return sum;
  }
}

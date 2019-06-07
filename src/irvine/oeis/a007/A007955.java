package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007955 Product of divisors of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A007955 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      prod = prod.multiply(d);
    }
    return prod;
  }
}

package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007426.
 * @author Sean A. Irvine
 */
public class A007426 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      for (final Z e : Cheetah.factor(d).divisors()) {
        sum = sum.add(Cheetah.factor(e).sigma0());
      }
    }
    return sum;
  }
}

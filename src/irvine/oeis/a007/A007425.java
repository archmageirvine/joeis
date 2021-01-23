package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007425 d_3(n), or tau_3(n), the number of ordered factorizations of n as n = r s t.
 * @author Sean A. Irvine
 */
public class A007425 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      sum = sum.add(Cheetah.factor(d).sigma0());
    }
    return sum;
  }
}

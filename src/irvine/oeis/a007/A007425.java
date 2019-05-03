package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007425 <code>d_3(n)</code>, or <code>tau_3(n)</code>, the number of ordered factorizations of n as <code>n =</code> r s t.
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

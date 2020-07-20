package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034444 <code>a(n)</code> is the number of unitary divisors of <code>n (d</code> such that d divides n, <code>gcd(d, n/d) = 1)</code>.
 * @author Sean A. Irvine
 */
public class A034444 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Cheetah.factor(mN).unitarySigma0();
  }
}


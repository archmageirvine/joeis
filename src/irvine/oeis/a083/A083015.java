package irvine.oeis.a083;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A083015 a(n) = the number of ordered pairs of n-bit bit strings, such that both bit strings have at least n/2 one-bits, or both have at most n/2 one-bits.
 * @author Sean A. Irvine
 */
public class A083015 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if ((++mN & 1) == 1) {
      return Z.ONE.shiftLeft(2 * mN - 1);
    }
    final Z c = Binomial.binomial(mN, mN / 2);
    return Z.ONE.shiftLeft(2 * mN).add(c.shiftLeft(mN + 1)).subtract(c.square()).divide2();
  }
}

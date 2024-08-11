package irvine.oeis.a071;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060315.
 * @author Sean A. Irvine
 */
public class A071800 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Binomial.multinomial(6 * mN, 2 * mN, 2 * mN, 2 * mN).subtract(Binomial.multinomial(3 * mN, mN, mN, mN).square());
  }
}

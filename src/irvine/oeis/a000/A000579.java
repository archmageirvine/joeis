package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000579 Figurate numbers or binomial coefficients C(n,6).
 * @author Sean A. Irvine
 */
public class A000579 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 6);
  }
}


package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000910 a(n) = 5*binomial(n, 6).
 * @author Sean A. Irvine
 */
public class A000910 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 6).multiply(5);
  }
}


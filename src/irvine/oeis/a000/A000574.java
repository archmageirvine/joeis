package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000574 Coefficient of <code>x^5</code> in expansion of <code>(1 + x + x^2)^n</code>.
 * @author Sean A. Irvine
 */
public class A000574 implements Sequence {

  private long mN = 3;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN, 4).multiply(mN + 11).divide(5);
  }
}


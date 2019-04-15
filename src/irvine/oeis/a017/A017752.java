package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017752 Binomial coefficients <code>C(n,88)</code>.
 * @author Sean A. Irvine
 */
public class A017752 implements Sequence {

  private long mN = 87;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 88);
  }
}


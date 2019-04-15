package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017739 Binomial coefficients <code>C(n,75)</code>.
 * @author Sean A. Irvine
 */
public class A017739 implements Sequence {

  private long mN = 74;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 75);
  }
}


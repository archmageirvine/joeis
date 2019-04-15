package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000582 Binomial coefficients <code>C(n,9)</code>.
 * @author Sean A. Irvine
 */
public class A000582 implements Sequence {

  private int mN = 8;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 9);
  }
}


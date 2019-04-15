package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000581 Binomial coefficients <code>C(n,8)</code>.
 * @author Sean A. Irvine
 */
public class A000581 implements Sequence {

  private int mN = 7;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 8);
  }
}


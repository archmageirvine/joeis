package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.z.Binomial;

/**
 * A002299 Binomial coefficients <code>C(2*n+5,5)</code>.
 * @author Sean A. Irvine
 */
public class A002299 implements Sequence {

  private int mN = 3;

  @Override
  public Z next() {
    mN += 2;
    return Binomial.binomial(mN, 5);
  }
}

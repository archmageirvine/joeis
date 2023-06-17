package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A005716 Coefficient of x^8 in expansion of (1+x+x^2)^n.
 * @author Sean A. Irvine
 */
public class A005716 extends AbstractSequence {

  /** Construct the sequence. */
  public A005716() {
    super(4);
  }

  private long mN = 3;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN + 1, 5).multiply(Z.valueOf(mN).add(23).multiply(mN).subtract(84)).multiply(mN + 10).divide(336);
  }
}

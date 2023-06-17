package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A005715 Coefficient of x^7 in expansion of (1+x+x^2)^n.
 * @author Sean A. Irvine
 */
public class A005715 extends AbstractSequence {

  /** Construct the sequence. */
  public A005715() {
    super(4);
  }

  private long mN = 3;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN, 4).multiply(Z.valueOf(mN).add(27).multiply(mN).add(116).multiply(mN).subtract(120)).divide(210);
  }
}

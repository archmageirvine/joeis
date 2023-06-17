package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017739 Binomial coefficients C(n,75).
 * @author Sean A. Irvine
 */
public class A017739 extends AbstractSequence {

  /** Construct the sequence. */
  public A017739() {
    super(75);
  }

  private long mN = 74;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 75);
  }
}


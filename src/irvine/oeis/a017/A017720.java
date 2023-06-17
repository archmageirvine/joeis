package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017720 Binomial coefficients C(n, 56).
 * @author Sean A. Irvine
 */
public class A017720 extends AbstractSequence {

  /** Construct the sequence. */
  public A017720() {
    super(56);
  }

  private long mN = 55;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 56);
  }
}


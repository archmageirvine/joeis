package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017722 Binomial coefficients C(n, 58).
 * @author Sean A. Irvine
 */
public class A017722 extends AbstractSequence {

  /** Construct the sequence. */
  public A017722() {
    super(58);
  }

  private long mN = 57;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 58);
  }
}


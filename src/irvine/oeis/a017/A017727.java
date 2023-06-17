package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017727 Binomial coefficients C(n, 63).
 * @author Sean A. Irvine
 */
public class A017727 extends AbstractSequence {

  /** Construct the sequence. */
  public A017727() {
    super(63);
  }

  private long mN = 62;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 63);
  }
}


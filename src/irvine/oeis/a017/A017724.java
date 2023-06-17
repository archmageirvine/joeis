package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017724 Binomial coefficients C(n,60).
 * @author Sean A. Irvine
 */
public class A017724 extends AbstractSequence {

  /** Construct the sequence. */
  public A017724() {
    super(60);
  }

  private long mN = 59;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 60);
  }
}


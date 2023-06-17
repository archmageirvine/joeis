package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017721 Binomial coefficients C(n,57).
 * @author Sean A. Irvine
 */
public class A017721 extends AbstractSequence {

  /** Construct the sequence. */
  public A017721() {
    super(57);
  }

  private long mN = 56;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 57);
  }
}


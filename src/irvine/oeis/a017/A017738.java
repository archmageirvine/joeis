package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017738 Binomial coefficients C(n,74).
 * @author Sean A. Irvine
 */
public class A017738 extends AbstractSequence {

  /** Construct the sequence. */
  public A017738() {
    super(74);
  }

  private long mN = 73;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 74);
  }
}


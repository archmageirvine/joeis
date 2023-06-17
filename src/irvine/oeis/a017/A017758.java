package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017758 Binomial coefficients C(n,94).
 * @author Sean A. Irvine
 */
public class A017758 extends AbstractSequence {

  /** Construct the sequence. */
  public A017758() {
    super(94);
  }

  private long mN = 93;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 94);
  }
}


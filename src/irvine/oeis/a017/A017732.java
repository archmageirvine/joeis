package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017732 Binomial coefficients C(n, 68).
 * @author Sean A. Irvine
 */
public class A017732 extends AbstractSequence {

  /** Construct the sequence. */
  public A017732() {
    super(68);
  }

  private long mN = 67;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 68);
  }
}


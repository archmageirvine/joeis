package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017723 Binomial coefficients C(n, 59).
 * @author Sean A. Irvine
 */
public class A017723 extends AbstractSequence {

  /** Construct the sequence. */
  public A017723() {
    super(59);
  }

  private long mN = 58;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 59);
  }
}


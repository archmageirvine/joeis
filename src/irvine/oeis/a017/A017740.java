package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017740 Binomial coefficients C(n, 76).
 * @author Sean A. Irvine
 */
public class A017740 extends AbstractSequence {

  /** Construct the sequence. */
  public A017740() {
    super(76);
  }

  private long mN = 75;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 76);
  }
}


package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017737 Binomial coefficients C(n,73).
 * @author Sean A. Irvine
 */
public class A017737 extends AbstractSequence {

  /** Construct the sequence. */
  public A017737() {
    super(73);
  }

  private long mN = 72;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 73);
  }
}


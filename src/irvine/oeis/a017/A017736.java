package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017736 Binomial coefficients C(n,72).
 * @author Sean A. Irvine
 */
public class A017736 extends AbstractSequence {

  /** Construct the sequence. */
  public A017736() {
    super(72);
  }

  private long mN = 71;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 72);
  }
}


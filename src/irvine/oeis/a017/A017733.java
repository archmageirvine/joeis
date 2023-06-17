package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017733 Binomial coefficients C(n, 69).
 * @author Sean A. Irvine
 */
public class A017733 extends AbstractSequence {

  /** Construct the sequence. */
  public A017733() {
    super(69);
  }

  private long mN = 68;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 69);
  }
}


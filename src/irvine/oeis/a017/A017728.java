package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017728 Binomial coefficients C(n,64).
 * @author Sean A. Irvine
 */
public class A017728 extends AbstractSequence {

  /** Construct the sequence. */
  public A017728() {
    super(64);
  }

  private long mN = 63;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 64);
  }
}


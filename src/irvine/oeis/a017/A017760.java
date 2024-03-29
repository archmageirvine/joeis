package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017760 Binomial coefficients C(n,96).
 * @author Sean A. Irvine
 */
public class A017760 extends AbstractSequence {

  /** Construct the sequence. */
  public A017760() {
    super(96);
  }

  private long mN = 95;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 96);
  }
}


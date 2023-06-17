package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017718 Binomial coefficients C(n,54).
 * @author Sean A. Irvine
 */
public class A017718 extends AbstractSequence {

  /** Construct the sequence. */
  public A017718() {
    super(54);
  }

  private long mN = 53;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 54);
  }
}


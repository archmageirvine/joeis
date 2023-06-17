package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017747 Binomial coefficients C(n, 83).
 * @author Sean A. Irvine
 */
public class A017747 extends AbstractSequence {

  /** Construct the sequence. */
  public A017747() {
    super(83);
  }

  private long mN = 82;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 83);
  }
}


package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017726 Binomial coefficients C(n,62).
 * @author Sean A. Irvine
 */
public class A017726 extends AbstractSequence {

  /** Construct the sequence. */
  public A017726() {
    super(62);
  }

  private long mN = 61;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 62);
  }
}


package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017754 Binomial coefficients C(n,90).
 * @author Sean A. Irvine
 */
public class A017754 extends AbstractSequence {

  /** Construct the sequence. */
  public A017754() {
    super(90);
  }

  private long mN = 89;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 90);
  }
}


package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017715 Binomial coefficients C(n,51).
 * @author Sean A. Irvine
 */
public class A017715 extends AbstractSequence {

  /** Construct the sequence. */
  public A017715() {
    super(51);
  }

  private long mN = 50;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 51);
  }
}


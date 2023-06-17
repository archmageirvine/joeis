package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017714 Binomial coefficients C(n,50).
 * @author Sean A. Irvine
 */
public class A017714 extends AbstractSequence {

  /** Construct the sequence. */
  public A017714() {
    super(50);
  }

  private long mN = 49;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 50);
  }
}


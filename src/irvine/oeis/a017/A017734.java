package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017734 Binomial coefficients C(n, 70).
 * @author Sean A. Irvine
 */
public class A017734 extends AbstractSequence {

  /** Construct the sequence. */
  public A017734() {
    super(70);
  }

  private long mN = 69;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 70);
  }
}


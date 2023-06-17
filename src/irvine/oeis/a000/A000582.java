package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000582 a(n) = binomial coefficient C(n, 9).
 * @author Sean A. Irvine
 */
public class A000582 extends AbstractSequence {

  /* Construct the sequence. */
  public A000582() {
    super(9);
  }

  private int mN = 8;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 9);
  }
}


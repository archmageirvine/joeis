package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017752 Binomial coefficients C(n, 88).
 * @author Sean A. Irvine
 */
public class A017752 extends AbstractSequence {

  /* Construct the sequence. */
  public A017752() {
    super(88);
  }

  private long mN = 87;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 88);
  }
}


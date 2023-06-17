package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017748 Binomial coefficients C(n, 84).
 * @author Sean A. Irvine
 */
public class A017748 extends AbstractSequence {

  /* Construct the sequence. */
  public A017748() {
    super(84);
  }

  private long mN = 83;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 84);
  }
}


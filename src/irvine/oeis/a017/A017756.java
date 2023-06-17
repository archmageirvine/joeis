package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017756 Binomial coefficients C(n, 92).
 * @author Sean A. Irvine
 */
public class A017756 extends AbstractSequence {

  /* Construct the sequence. */
  public A017756() {
    super(92);
  }

  private long mN = 91;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 92);
  }
}


package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017725 Binomial coefficients C(n, 61).
 * @author Sean A. Irvine
 */
public class A017725 extends AbstractSequence {

  /* Construct the sequence. */
  public A017725() {
    super(61);
  }

  private long mN = 60;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 61);
  }
}


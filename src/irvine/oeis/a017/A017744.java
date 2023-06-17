package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017744 Binomial coefficients C(n, 80).
 * @author Sean A. Irvine
 */
public class A017744 extends AbstractSequence {

  /* Construct the sequence. */
  public A017744() {
    super(80);
  }

  private long mN = 79;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 80);
  }
}


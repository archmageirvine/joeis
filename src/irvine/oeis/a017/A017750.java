package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017750 Binomial coefficients C(n, 86).
 * @author Sean A. Irvine
 */
public class A017750 extends AbstractSequence {

  /* Construct the sequence. */
  public A017750() {
    super(86);
  }

  private long mN = 85;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 86);
  }
}


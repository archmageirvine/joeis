package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017761 Binomial coefficients C(n, 97).
 * @author Sean A. Irvine
 */
public class A017761 extends AbstractSequence {

  /* Construct the sequence. */
  public A017761() {
    super(97);
  }

  private long mN = 96;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 97);
  }
}


package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017746 Binomial coefficients C(n, 82).
 * @author Sean A. Irvine
 */
public class A017746 extends AbstractSequence {

  /** Construct the sequence. */
  public A017746() {
    super(82);
  }

  private long mN = 81;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 82);
  }
}


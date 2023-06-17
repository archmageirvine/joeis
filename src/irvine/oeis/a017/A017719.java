package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017719 Binomial coefficients C(n, 55).
 * @author Sean A. Irvine
 */
public class A017719 extends AbstractSequence {

  /** Construct the sequence. */
  public A017719() {
    super(55);
  }

  private long mN = 54;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 55);
  }
}


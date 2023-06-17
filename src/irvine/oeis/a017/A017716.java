package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017716 Binomial coefficients C(n, 52).
 * @author Sean A. Irvine
 */
public class A017716 extends AbstractSequence {

  /** Construct the sequence. */
  public A017716() {
    super(52);
  }

  private long mN = 51;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 52);
  }
}


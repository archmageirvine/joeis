package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017735 Binomial coefficients C(n, 71).
 * @author Sean A. Irvine
 */
public class A017735 extends AbstractSequence {

  /** Construct the sequence. */
  public A017735() {
    super(71);
  }

  private long mN = 70;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 71);
  }
}


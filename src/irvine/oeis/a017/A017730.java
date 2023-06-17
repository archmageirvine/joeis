package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017730 Binomial coefficients C(n,66).
 * @author Sean A. Irvine
 */
public class A017730 extends AbstractSequence {

  /** Construct the sequence. */
  public A017730() {
    super(66);
  }

  private long mN = 65;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 66);
  }
}


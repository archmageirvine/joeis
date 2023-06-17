package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017731 Binomial coefficients C(n,67).
 * @author Sean A. Irvine
 */
public class A017731 extends AbstractSequence {

  /** Construct the sequence. */
  public A017731() {
    super(67);
  }

  private long mN = 66;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 67);
  }
}


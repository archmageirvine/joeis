package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017713 Binomial coefficients C(n,49).
 * @author Sean A. Irvine
 */
public class A017713 extends AbstractSequence {

  /** Construct the sequence. */
  public A017713() {
    super(49);
  }

  private long mN = 48;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 49);
  }
}


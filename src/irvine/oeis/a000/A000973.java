package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000973 Fermat coefficients.
 * @author Sean A. Irvine
 */
public class A000973 extends AbstractSequence {

  /* Construct the sequence. */
  public A000973() {
    super(8);
  }

  private long mN = 14;

  @Override
  public Z next() {
    mN += 2;
    return Binomial.binomial(mN - 8, 7).divide(8);
  }
}

package irvine.oeis.a002;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002417 4-dimensional figurate numbers: a(n) = n*binomial(n+2, 3).
 * @author Sean A. Irvine
 */
public class A002417 extends AbstractSequence {

  /* Construct the sequence. */
  public A002417() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN + 2, 3).multiply(mN);
  }
}

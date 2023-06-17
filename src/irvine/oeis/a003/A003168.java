package irvine.oeis.a003;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A003168 Number of blobs with 2n+1 edges.
 * @author Sean A. Irvine
 */
public class A003168 extends AbstractSequence {

  /** Construct the sequence. */
  public A003168() {
    super(0);
  }

  long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z s = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      s = s.add(Binomial.binomial(mN, k).multiply(Binomial.binomial(2 * mN + k, k - 1)));
    }
    return s.divide(mN);
  }
}

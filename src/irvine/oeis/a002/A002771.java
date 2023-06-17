package irvine.oeis.a002;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002771 Number of terms in a skew determinant: a(n) = (A000085(n) + A081919(n))/2.
 * @author Sean A. Irvine
 */
public class A002771 extends AbstractSequence {

  /** Construct the sequence. */
  public A002771() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    Z df = Z.ONE;
    for (long k = 0; k <= mN; k += 2) {
      s = s.add(Binomial.binomial(mN, k).multiply(df).multiply(df.add(1)).divide2());
      df = df.multiply(k + 1);
    }
    return s;
  }
}

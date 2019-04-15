package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.z.Binomial;

/**
 * A002417 4-dimensional figurate numbers: <code>a(n) = n*binomial(n+2, 3)</code>.
 * @author Sean A. Irvine
 */
public class A002417 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN + 2, 3).multiply(mN);
  }
}

package irvine.oeis.a068;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A068943 <code>a(n) = f(n, n, n)</code>, where f is the generalized super falling factorial (see comments for definition.).
 * @author Sean A. Irvine
 */
public class A068943 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (long m = 1; m <= mN; ++m) {
      final Z b = Binomial.binomial(m + mN - 2, m - 1);
      if (b.bitLength() > 30) {
        throw new UnsupportedOperationException();
      }
      prod = prod.multiply(Z.valueOf(mN - m + 1).pow(b.intValue()));
    }
    return prod;
  }
}


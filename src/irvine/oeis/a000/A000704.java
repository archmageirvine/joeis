package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000704 Number of degree-n even permutations of order dividing 2.
 * @author Sean A. Irvine
 */
public class A000704 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    Z f = Z.ONE;
    for (long k = 0; k <= mN; k += 4) {
      if (k != 0) {
        f = f.multiply(k - 1).multiply(k - 3);
      }
      s = s.add(Binomial.binomial(mN, k).multiply(f));
    }
    return s;
  }
}

package irvine.oeis.a018;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A018191 a(n) = Sum_{k=0..n} binomial(n, k) * k! / floor(k/2)!.
 * @author Sean A. Irvine
 */
public class A018191 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    Z f = Z.ONE;
    for (int k = 0; k <= mN; ++k) {
      if (k > 1) {
        f = f.multiply(k);
        if ((k & 1) == 0) {
          f = f.divide(k / 2);
        }
      }
      sum = sum.add(Binomial.binomial(mN, k).multiply(f));
    }
    return sum;
  }
}


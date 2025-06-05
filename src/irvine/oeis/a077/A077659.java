package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077659 a(n) = smallest k&gt;1 such that the sum n^k + (n+1)^k is prime, or -1 if no such k exists.
 * @author Sean A. Irvine
 */
public class A077659 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z nk = Z.valueOf(++mN);
    Z nk1 = Z.valueOf(mN + 1);
    long k = 1;
    while (true) {
      ++k;
      nk = nk.multiply(mN);
      nk1 = nk1.multiply(mN + 1);
      if (nk1.add(nk).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}

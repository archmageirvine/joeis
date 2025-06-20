package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A078178 Least k&gt;=2 such that n^k + n - 1 is prime.
 * @author Sean A. Irvine
 */
public class A078178 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    long k = 1;
    Z n = Z.valueOf(++mN);
    while (true) {
      ++k;
      n = n.multiply(mN);
      if (n.add(mN - 1).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}

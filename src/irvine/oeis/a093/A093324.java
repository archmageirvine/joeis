package irvine.oeis.a093;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A093324 a(n) is the smallest natural number m such that n^m + m is prime.
 * @author Sean A. Irvine
 */
public class A093324 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    Z t = Z.ONE;
    while (true) {
      t = t.multiply(mN);
      if (t.add(++k).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}

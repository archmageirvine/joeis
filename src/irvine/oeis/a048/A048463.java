package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a047.A047844;

/**
 * A048463 Smallest prime occurring in generation n (0 if none).
 * @author Sean A. Irvine
 */
public class A048463 extends A047844 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z t;
    long m = 0;
    while (m <= mN) {
      t = get(++m, mN);
      if (t.isProbablePrime()) {
        return t;
      }
    }
//    while ((t = get(++m, mN)).isOdd()) {
//      if (t.isProbablePrime()) {
//        return t;
//      }
//    }
    return Z.ZERO;
  }
}

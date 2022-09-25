package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059411 a(1) = 2, a(n) = k*a(n-1) + 1, where a(n) is the smallest prime of the form k*a(n-1) + 1 and k &gt; 1.
 * @author Sean A. Irvine
 */
public class A059411 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
    } else {
      long k = 1;
      do {
        ++k;
      } while (!mA.multiply(k).add(1).isProbablePrime());
      mA = mA.multiply(k).add(1);
    }
    return mA;
  }
}

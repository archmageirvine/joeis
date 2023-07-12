package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064457 a(1) = 3; for n &gt; 1, choose a(n) to be the smallest number such that a(n) &gt; a(n-1) and (a(n)*a(n-1)+1) mod (a(n)+a(n-1)+1) = 0.
 * @author Sean A. Irvine
 */
public class A064457 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.THREE;
    } else {
      final long a = mA.longValueExact();
      long k = a;
      long mod = 2 * a + 1;
      while (true) {
        if (mA.multiply(++k).mod(++mod) == mod - 1) {
          mA = Z.valueOf(k);
          break;
        }
      }
    }
    return mA;
  }
}

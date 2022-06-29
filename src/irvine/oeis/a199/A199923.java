package irvine.oeis.a199;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A199923 Sum_{0&lt;=k&lt;=3^(n-1)} gcd(k,3^(n-1)) for n &gt; 0 and a(0) = 1.
 * @author Sean A. Irvine
 */
public class A199923 implements Sequence {

  private long mN = -1;
  private Z mA = null;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    } else if (mN == 1) {
      return Z.TWO;
    } else if (mA == null) {
      mA = Z.TWO;
    } else {
      mA = mA.multiply(3);
    }
    return mA.multiply(mN + 2);
  }
}

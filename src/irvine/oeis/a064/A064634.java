package irvine.oeis.a064;

import irvine.math.z.Z;

/**
 * A064634 a(0) = 0 and a(n) = Min { i &gt; a(n-1) | A064466(i + 1) - A064466(i) &gt; 2 } for n &gt; 0.
 * @author Sean A. Irvine
 */
public class A064634 extends A064466 {

  private long mN = -1;
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = super.next();
      return Z.ZERO;
    }
    while (true) {
      ++mN;
      final Z t = mA;
      mA = super.next();
      if (mA.subtract(t).compareTo(Z.TWO) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

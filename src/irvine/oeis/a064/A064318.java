package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a000.A000312;

/**
 * A064318 a(n) satisfies a(n)! &lt;= n^n &lt; (a(n)+1)!.
 * @author Sean A. Irvine
 */
public class A064318 extends A000312 {

  private Z mF = Z.ONE;
  private long mN = 1;

  @Override
  public Z next() {
    final Z t = super.next();
    while (mF.compareTo(t) <= 0) {
      mF = mF.multiply(++mN);
    }
    return Z.valueOf(mN - 1);
  }
}

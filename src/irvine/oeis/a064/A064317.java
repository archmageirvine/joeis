package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A064317 a(n) satisfies a(n)^a(n) &lt;= n! &lt; (a(n)+1)^(a(n)+1).
 * @author Sean A. Irvine
 */
public class A064317 extends A000142 {

  private long mN = 1;

  @Override
  public Z next() {
    final Z f = super.next();
    while (Z.valueOf(mN).pow(mN).compareTo(f) <= 0) {
      ++mN;
    }
    return Z.valueOf(mN - 1);
  }
}

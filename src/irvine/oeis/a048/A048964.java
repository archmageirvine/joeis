package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A048964 a(n) is smallest number k such that k! &gt;= n-th primorial number (A002110(n)).
 * @author Sean A. Irvine
 */
public class A048964 extends A002110 {

  private long mN = 1;
  private Z mF = Z.ONE;
  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    final Z p = super.next();
    while (mF.compareTo(p) < 0) {
      mF = mF.multiply(++mN);
    }
    return Z.valueOf(mN);
  }
}

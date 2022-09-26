package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.a001.A001481;

/**
 * A047808 a(n) counts different values of i^2 + j^2 &lt;= n^2 or number of distances from the origin to all integer points inside a circle of radius n.
 * @author Sean A. Irvine
 */
public class A047808 extends A001481 {

  private Z mA = super.next();
  private long mC = 0;
  private long mN = -1;

  @Override
  public int getOffset() {
    return 0;
  }

  @Override
  public Z next() {
    final Z n2 = Z.valueOf(++mN).square();
    while (mA.compareTo(n2) <= 0) {
      ++mC;
      mA = super.next();
    }
    return Z.valueOf(mC);
  }
}

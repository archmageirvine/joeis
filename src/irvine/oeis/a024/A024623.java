package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A024623 a(n) is the number of prime powers &lt;= 3^n.
 * @author Sean A. Irvine
 */
public class A024623 extends A000961 {

  private long mN = 0;
  private Z mT = null;

  @Override
  public Z next() {
    mT = mT == null ? Z.ONE : mT.multiply(3);
    while (true) {
      ++mN;
      if (super.next().equals(mT)) {
        return Z.valueOf(mN);
      }
    }
  }
}

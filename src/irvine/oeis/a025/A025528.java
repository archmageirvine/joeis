package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A025528 Number of prime powers &lt;= n with exponents &gt; 0 (A246655).
 * @author Sean A. Irvine
 */
public class A025528 extends A000961 {

  private Z mA = super.next();
  private Z mN = Z.ZERO;
  private long mC = -1;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.equals(mA)) {
      mA = super.next();
      ++mC;
    }
    return Z.valueOf(mC);
  }
}

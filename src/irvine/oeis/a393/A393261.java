package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A393261 Irregular table T(n,k) = 2^(prime(n)-k) * prime(n)^k, n &gt;= 1, k = 1..prime(n)-1.
 * @author Sean A. Irvine
 */
public class A393261 extends A000040 {

  private long mM = 0;
  private Z mP = Z.ZERO;

  @Override
  public Z next() {
    if (mP.compareTo(++mM) <= 0) {
      mP = super.next();
      mM = 1;
    }
    return mP.pow(mM).shiftLeft(mP.subtract(mM).longValueExact());
  }
}

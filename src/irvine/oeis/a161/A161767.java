package irvine.oeis.a161;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A161767 a(0)=0, a(1)=2. For n &gt;=2, a(n) = the smallest integer &gt;= a(n-1)+2 with exactly (a(n-1)-a(n-2)) divisors.
 * @author Sean A. Irvine
 */
public class A161767 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
      return mA;
    }
    if (mB == null) {
      mB = Z.TWO;
      return mB;
    }
    final long d = mB.subtract(mA).longValue();
    Z n = mB.add(2);
    while (true) {
      if (Jaguar.factor(n).sigma0AsLong() == d) {
        mA = mB;
        mB = n;
        return n;
      }
      n = n.add(1);
    }
  }
}


package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A066628 a(n) = n - the largest Fibonacci number &lt;= n.
 * @author Sean A. Irvine
 */
public class A066628 extends Sequence0 {

  private long mN = -1;
  private long mA = 0;
  private long mB = 1;

  @Override
  public Z next() {
    ++mN;
    while (mB <= mN) {
      final long t = mA + mB;
      mA = mB;
      mB = t;
    }
    return Z.valueOf(mN - mA);
  }
}

package irvine.oeis.a076;

import irvine.math.z.Z;

/**
 * A076872 a(n) = number of numbers &lt;= n that are the sum of two squarefull numbers.
 * @author Sean A. Irvine
 */
public class A076872 extends A076871 {

  private long mN = 0;
  private Z mA = super.next();
  private Z mCount = Z.ZERO;

  @Override
  public Z next() {
    if (mA.equals(++mN)) {
      mA = super.next();
      mCount = mCount.add(1);
    }
    return mCount;
  }
}

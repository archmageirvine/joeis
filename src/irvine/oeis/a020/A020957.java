package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.a000.A000032;

/**
 * A020957 a(n) = Sum_{k &gt;= 1} floor(2*tau^(n-k)).
 * @author Sean A. Irvine
 */
public class A020957 extends A000032 {

  {
    super.next();
    super.next();
    super.next();
  }
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.THREE;
    }
    return super.next().shiftLeft(3).subtract(2 * mN + 5 - ((mN & 1) == 0 ? 1 : -1)).shiftRight(2);
  }
}

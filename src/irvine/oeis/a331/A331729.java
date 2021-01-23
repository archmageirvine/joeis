package irvine.oeis.a331;

import irvine.math.z.Z;
import irvine.oeis.a002.A002858;

/**
 * A331729 Number of Ulam numbers u (A002858) between powers of 2, 2^n &lt; u &lt;= 2^(n+1).
 * @author Sean A. Irvine
 */
public class A331729 extends A002858 {

  private Z mLim = Z.ONE;
  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    mLim = mLim.shiftLeft(1);
    long cnt = 1; // start at 1 from value in previous iteration
    while (super.next().compareTo(mLim) <= 0) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

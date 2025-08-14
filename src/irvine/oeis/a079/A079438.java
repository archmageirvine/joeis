package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A079438 a(0) = a(1) = 1, a(n) = 2*(floor((n+1)/3) + (if n &gt;= 14) (floor((n-10)/4) + floor((n-14)/8))).
 * @author Sean A. Irvine
 */
public class A079438 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ONE;
    }
    final long t = (mN + 1) / 3;
    return Z.valueOf(mN < 14 ? t : (t + ((mN - 10) / 4 + (mN - 14) / 8))).multiply2();
  }
}


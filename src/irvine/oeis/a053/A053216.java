package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a001.A001156;

/**
 * A053216 Number of integers that can be partitioned into squares in n different ways, or the number of times n occurs in A001156.
 * @author Sean A. Irvine
 */
public class A053216 extends A001156 {

  private Z mN = Z.ZERO;
  private Z mA = super.next();

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    long cnt = 0;
    while (mA.equals(mN)) {
      ++cnt;
      mA = super.next();
    }
    return Z.valueOf(cnt);
  }
}

package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A052005 Number of Fibonacci numbers (A000045) with length n in base 2.
 * @author Sean A. Irvine
 */
public class A052005 extends A000045 {

  {
    super.next();
  }
  private Z mA = super.next();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    while (mA.bitLength() <= mN) {
      ++cnt;
      mA = super.next();
    }
    return Z.valueOf(cnt);
  }
}


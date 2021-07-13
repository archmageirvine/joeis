package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a014.A014575;

/**
 * A048935 Number of distinct vampire numbers (definition 2) having 2n digits.
 * @author Sean A. Irvine
 */
public class A048935 extends A014575 {

  private int mA = super.next().toString().length();
  private int mN = 0;

  @Override
  public Z next() {
    mN += 2;
    long cnt = 0;
    while (mA == mN) {
      ++cnt;
      mA = super.next().toString().length();
    }
    return Z.valueOf(cnt);
  }
}


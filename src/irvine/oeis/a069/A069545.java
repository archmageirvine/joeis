package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.a008.A008836;

/**
 * A069522.
 * @author Sean A. Irvine
 */
public class A069545 extends A008836 {

  private long mSign = super.next().signum();

  @Override
  public Z next() {
    long cnt = 1;
    while (super.next().signum() == mSign) {
      ++cnt;
    }
    mSign = -mSign;
    return Z.valueOf(cnt);
  }
}

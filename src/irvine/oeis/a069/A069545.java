package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.a008.A008836;

/**
 * A069545 Liouville clusters: the number of successive occurrences of signs in Liouville function lambda(k); a(2n-1) is number of successive positive signs, while a(2n) is number of successive negative signs.
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

package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049046 Number of k &gt;= 1 with k! == 1 (mod n).
 * @author Sean A. Irvine
 */
public class A049046 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 1 % mN;
    long f = 1;
    long m = 1;
    while (f != 0) {
      f *= ++m;
      f %= mN;
      if (f == 1) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

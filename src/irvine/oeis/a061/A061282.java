package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061281.
 * @author Sean A. Irvine
 */
public class A061282 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    long cnt = 0;
    while (m != 0) {
      m = m % 3 == 0 ? m / 3 : m - 1;
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

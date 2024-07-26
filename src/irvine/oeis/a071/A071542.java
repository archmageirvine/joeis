package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071531.
 * @author Sean A. Irvine
 */
public class A071542 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long cnt = 0;
    long m = ++mN;
    while (m != 0) {
      ++cnt;
      m -= Long.bitCount(m);
    }
    return Z.valueOf(cnt);
  }
}

package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056978 Number of blocks of {1, 0, 0} in binary expansion of n.
 * @author Sean A. Irvine
 */
public class A056978 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    long cnt = 0;
    while (m > 0) {
      if ((m & 7) == 4) {
        ++cnt;
      }
      m >>>= 1;
    }
    return Z.valueOf(cnt);
  }
}

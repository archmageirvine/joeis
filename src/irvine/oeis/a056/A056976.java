package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056976 Number of blocks of {0, 1, 0} in the binary expansion of n.
 * @author Sean A. Irvine
 */
public class A056976 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    long cnt = 0;
    while (m > 8) {
      if ((m & 7) == 2) {
        ++cnt;
      }
      m >>>= 1;
    }
    return Z.valueOf(cnt);
  }
}

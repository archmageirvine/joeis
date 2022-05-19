package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056980 Number of blocks of {1, 1, 0} in binary expansion of n.
 * @author Sean A. Irvine
 */
public class A056980 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    long cnt = 0;
    while (m > 0) {
      if ((m & 7) == 6) {
        ++cnt;
      }
      m >>>= 1;
    }
    return Z.valueOf(cnt);
  }
}

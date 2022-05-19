package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056977 Number of blocks of {0, 1, 1} in binary expansion of n.
 * @author Sean A. Irvine
 */
public class A056977 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    long cnt = 0;
    while (m > 8) {
      if ((m & 7) == 3) {
        ++cnt;
      }
      m >>>= 1;
    }
    return Z.valueOf(cnt);
  }
}

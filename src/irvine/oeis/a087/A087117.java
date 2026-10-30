package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A087117 Number of zeros in the longest string of consecutive zeros in the binary representation of n.
 * @author Sean A. Irvine
 */
public class A087117 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    int max = 0;
    long m = mN;
    while (true) {
      while ((m & 1) == 1) {
        m >>>= 1;
      }
      if (m == 0) {
        break;
      }
      int cnt = 0;
      do {
        ++cnt;
        m >>>= 1;
      } while ((m & 1) == 0);
      if (cnt > max) {
        max = cnt;
      }
    }
    return Z.valueOf(max);
  }
}

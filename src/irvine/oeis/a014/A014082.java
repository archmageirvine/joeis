package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014082 Number of occurrences of '111' in binary expansion of n.
 * @author Sean A. Irvine
 */
public class A014082 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    int c = 0;
    while (m >= 7) {
      if ((m & 7) == 7) {
        ++c;
      }
      m >>>= 1;
    }
    return Z.valueOf(c);
  }
}

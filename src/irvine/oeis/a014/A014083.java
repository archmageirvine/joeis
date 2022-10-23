package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014083 Occurrences of '1111' in binary expansion of n.
 * @author Sean A. Irvine
 */
public class A014083 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    int c = 0;
    while (m >= 15) {
      if ((m & 15) == 15) {
        ++c;
      }
      m >>>= 1;
    }
    return Z.valueOf(c);
  }
}

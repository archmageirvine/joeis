package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014081 a(n) is the number of occurrences of '11' in the binary expansion of n.
 * @author Sean A. Irvine
 */
public class A014081 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    int c = 0;
    while (m >= 3) {
      if ((m & 3) == 3) {
        ++c;
      }
      m >>>= 1;
    }
    return Z.valueOf(c);
  }
}

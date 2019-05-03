package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014081 <code>a(n) =</code> number of occurrences of <code>'11'</code> in binary expansion of n.
 * @author Sean A. Irvine
 */
public class A014081 implements Sequence {

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

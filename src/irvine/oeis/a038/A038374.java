package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038374 Length of longest contiguous block of 1's in binary expansion of n.
 * @author Sean A. Irvine
 */
public class A038374 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long max = 0;
    long m = ++mN;
    long c = 0;
    while (m != 0) {
      if ((m & 1) == 1) {
        ++c;
      } else {
        max = Long.max(max, c);
        c = 0;
      }
      m >>>= 1;
    }
    max = Long.max(max, c);
    return Z.valueOf(max);
  }
}

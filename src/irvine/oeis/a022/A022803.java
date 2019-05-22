package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022803 Numbers that reach ...,7,8,4,2,1 under the mapping: if n is even divide by 2 else add 1.
 * @author Sean A. Irvine
 */
public class A022803 implements Sequence {

  private long mN = 12;

  @Override
  public Z next() {
    while (true) {
      long m = ++mN;
      while (m >= 7) {
        if (m == 7) {
          return Z.valueOf(mN);
        }
        m = (m & 1) == 0 ? m >>> 1 : m + 1;
      }
    }
  }
}

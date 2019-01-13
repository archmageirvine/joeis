package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014083.
 * @author Sean A. Irvine
 */
public class A014083 implements Sequence {

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

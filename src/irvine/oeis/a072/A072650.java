package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072660.
 * @author Sean A. Irvine
 */
public class A072650 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long r = 0;
    long m = ++mN;
    long k = 1;
    while (m != 0) {
      if ((m & 1) == 0) {
        k <<= 1;
        m >>>= 1;
      } else {
        r += k;
        k <<= 1;
        m >>>= 2;
      }
    }
    return Z.valueOf(r);
  }
}

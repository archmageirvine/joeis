package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A030102 Base-3 reversal of n (written in base 10).
 * @author Sean A. Irvine
 */
public class A030102 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long r = 0;
    long s = ++mN;
    while (s != 0) {
      r *= 3;
      r += s % 3;
      s /= 3;
    }
    return Z.valueOf(r);
  }
}

package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A030108 Base 9 reversal of n (written in base 10).
 * @author Sean A. Irvine
 */
public class A030108 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long r = 0;
    long s = ++mN;
    while (s != 0) {
      r *= 9;
      r += s % 9;
      s /= 9;
    }
    return Z.valueOf(r);
  }
}

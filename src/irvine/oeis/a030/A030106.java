package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030106 Base 7 reversal of n (written in base 10).
 * @author Sean A. Irvine
 */
public class A030106 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    long r = 0;
    long s = ++mN;
    while (s != 0) {
      r *= 7;
      r += s % 7;
      s /= 7;
    }
    return Z.valueOf(r);
  }
}

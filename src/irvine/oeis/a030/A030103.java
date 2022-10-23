package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A030103 Base 4 reversal of n (written in base 10).
 * @author Sean A. Irvine
 */
public class A030103 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long r = 0;
    long s = ++mN;
    while (s != 0) {
      r <<= 2;
      r |= s & 3;
      s >>>= 2;
    }
    return Z.valueOf(r);
  }
}

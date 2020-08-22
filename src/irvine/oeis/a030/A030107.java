package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030107 Base 8 reversal of n (written in base 10).
 * @author Sean A. Irvine
 */
public class A030107 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    long r = 0;
    long s = ++mN;
    while (s != 0) {
      r <<= 3;
      r |= s & 7;
      s >>>= 3;
    }
    return Z.valueOf(r);
  }
}

package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030104 Base 5 reversal of n (written in base 10).
 * @author Sean A. Irvine
 */
public class A030104 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    long r = 0;
    long s = ++mN;
    while (s != 0) {
      r *= 5;
      r += s % 5;
      s /= 5;
    }
    return Z.valueOf(r);
  }
}

package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030105 Base 6 reversal of <code>n</code> (written in base <code>10)</code>.
 * @author Sean A. Irvine
 */
public class A030105 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    long r = 0;
    long s = ++mN;
    while (s != 0) {
      r *= 6;
      r += s % 6;
      s /= 6;
    }
    return Z.valueOf(r);
  }
}

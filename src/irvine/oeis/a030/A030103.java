package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030103 Base 4 reversal of <code>n</code> (written in base <code>10)</code>.
 * @author Sean A. Irvine
 */
public class A030103 implements Sequence {

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

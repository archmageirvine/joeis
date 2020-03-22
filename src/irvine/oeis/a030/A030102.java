package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030102 <code>Base-3</code> reversal of <code>n</code> (written in base <code>10)</code>.
 * @author Sean A. Irvine
 */
public class A030102 implements Sequence {

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

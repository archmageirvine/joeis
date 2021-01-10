package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038189 Bit to left of least significant 1-bit in binary expansion of n.
 * @author Sean A. Irvine
 */
public class A038189 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    long m = mN;
    while ((m & 1) != 1) {
      m >>>= 1;
    }
    return Z.valueOf((m >>> 1) & 1);
  }
}

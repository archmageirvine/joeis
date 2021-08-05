package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049606 Largest odd divisor of n!.
 * @author Sean A. Irvine
 */
public class A049606 implements Sequence {

  private Z mF = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 2) {
      long m = mN;
      while ((m & 1) == 0) {
        m >>>= 1;
      }
      mF = mF.multiply(m);
    }
    return mF;
  }
}


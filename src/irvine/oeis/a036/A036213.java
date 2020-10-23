package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036213.
 * @author Sean A. Irvine
 */
public class A036213 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return Z.ONE.shiftLeft(2 * mN * mN + 2 * mN).subtract(1).divide(Z.ONE.shiftLeft(2 * mN).subtract(1));
  }
}


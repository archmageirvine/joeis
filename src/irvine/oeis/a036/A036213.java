package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036213 Duplicating binary multipliers; i.e., n+1 1-bits placed 2n bits from each other.
 * @author Sean A. Irvine
 */
public class A036213 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return Z.ONE.shiftLeft(2L * mN * mN + 2L * mN).subtract(1).divide(Z.ONE.shiftLeft(2L * mN).subtract(1));
  }
}


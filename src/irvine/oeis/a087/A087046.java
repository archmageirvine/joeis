package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087046 Algebraic order of r_n, the value of r in the logistic map that corresponding to the onset of the period 2^n-cycle.
 * @author Sean A. Irvine
 */
public class A087046 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return ++mN == 1
      ? Z.ONE
      : Z.ONE.shiftLeft(1L << (mN - 1)).subtract(Z.ONE.shiftLeft(1L << (mN - 2)));
  }
}

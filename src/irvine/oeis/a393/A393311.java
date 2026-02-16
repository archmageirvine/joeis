package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A393311 allocated for Zhuorui He.
 * @author Sean A. Irvine
 */
public class A393311 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return ((mN + mM) & 1) == 0 ? Z.ZERO : Binomial.binomial(mN, mM).multiply(Functions.MULTIFACTORIAL.z(2, mN - mM - 2).square());
  }
}

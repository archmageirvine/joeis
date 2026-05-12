package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394178 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A394178 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Functions.GCD.l(mN, mM) != 1 ? Z.ZERO : Z.valueOf(mN * mM - mN - mM);
  }
}

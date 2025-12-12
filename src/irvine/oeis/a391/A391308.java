package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391308 allocated for Ludovic Schwob.
 * @author Sean A. Irvine
 */
public class A391308 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    if (mM == 0) {
      return Functions.FACTORIAL.z(mN);
    }
    if (mM == 1) {
      return Functions.FACTORIAL.z(mN).multiply(mN - 1).divide2();
    }
    return Functions.FACTORIAL.z(mN).multiply(mN - mM).multiply2().divide(mM + 1);
  }
}


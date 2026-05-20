package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A392672 allocated for Zhining Yang.
 * @author Sean A. Irvine
 */
public class A392672 extends Sequence2 {

  private int mN = 1;
  private long mM = 1;

  @Override
  public Z next() {
    ++mN;
    while (Functions.OMEGA.i(Z.valueOf(mM).multiply(mM + 1).multiply(mM + 2)) < mN) {
      ++mM;
    }
    return Z.valueOf(mM);
  }
}

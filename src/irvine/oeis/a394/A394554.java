package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A394554 allocated for Zhining Yang.
 * @author Sean A. Irvine
 */
public class A394554 extends Sequence2 {

  private int mN = 1;
  private long mM = 1;

  @Override
  public Z next() {
    ++mN;
    while (Functions.OMEGA.i(Z.valueOf(mM).multiply(mM + 1).multiply(mM + 2).multiply(mM + 3)) < mN) {
      ++mM;
    }
    return Z.valueOf(mM);
  }
}

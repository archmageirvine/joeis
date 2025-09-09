package irvine.oeis.a121;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A121998 Table, n-th row gives numbers between 1 and n that have a common factor with n.
 * @author Sean A. Irvine
 */
public class A121998 extends Sequence2 {

  private long mN = 2;
  private long mM = 1;

  @Override
  public Z next() {
    while (true) {
      if (++mM > mN) {
        ++mN;
        mM = 2;
      }
      if (Functions.GCD.l(mN, mM) > 1) {
        return Z.valueOf(mM);
      }
    }
  }
}

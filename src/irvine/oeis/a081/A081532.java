package irvine.oeis.a081;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a005.A005179;

/**
 * A081532 Triangle read by rows: let m be smallest number with n divisors, then row n gives divisors of m.
 * @author Sean A. Irvine
 */
public class A081532 extends A005179 {

  private Z[] mRow = {};
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mRow.length) {
      mRow = Jaguar.factor(super.next()).divisorsSorted();
      mM = 0;
    }
    return mRow[mM];
  }
}

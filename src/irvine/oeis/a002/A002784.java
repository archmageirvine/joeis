package irvine.oeis.a002;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002784 A problem in parity.
 * @author Sean A. Irvine
 */
public class A002784 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    long s = 0;
    for (int k = 1; k <= mN; ++k) {
      if (Functions.GCD.l(mN, k) == 1) {
        s += Functions.FACTORIAL.z(mN + k - 1).divide(Functions.FACTORIAL.z(mN)).divide(Functions.FACTORIAL.z(k)).mod(2);
      }
    }
    return Z.valueOf(s);
  }
}

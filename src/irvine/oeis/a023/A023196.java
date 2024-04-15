package irvine.oeis.a023;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023196 Nondeficient numbers: numbers k such that sigma(k) &gt;= 2k; union of A000396 and A005101.
 * @author Sean A. Irvine
 */
public class A023196 extends Sequence1 {

  private Z mN = Z.FIVE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Functions.SIGMA.z(mN).compareTo(mN.multiply2()) >= 0) {
        return mN;
      }
    }
  }
}

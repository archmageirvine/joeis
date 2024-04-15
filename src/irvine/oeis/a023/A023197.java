package irvine.oeis.a023;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023197 Numbers k such that sigma(k) &gt;= 3*k.
 * @author Sean A. Irvine
 */
public class A023197 extends Sequence1 {

  private Z mN = Z.valueOf(119);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Functions.SIGMA.z(mN).compareTo(mN.multiply(3)) >= 0) {
        return mN;
      }
    }
  }
}

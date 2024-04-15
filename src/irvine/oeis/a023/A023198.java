package irvine.oeis.a023;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023198 Numbers k such that sigma(k) &gt;= 4*k.
 * @author Sean A. Irvine
 */
public class A023198 extends Sequence1 {

  private Z mN = Z.valueOf(27719);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Functions.SIGMA.z(mN).compareTo(mN.multiply(4)) >= 0) {
        return mN;
      }
    }
  }
}

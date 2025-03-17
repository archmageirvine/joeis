package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.a006.A006513;

/**
 * A076057 Numbers k such that Sum_{j=1..k} A006513(j) = 3*k/2.
 * @author Sean A. Irvine
 */
public class A076057 extends A006513 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mSum = mSum.add(super.next());
      if (mN.multiply(3).equals(mSum.multiply2())) {
        return mN;
      }
    }
  }
}

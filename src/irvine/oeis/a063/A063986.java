package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a051.A051953;

/**
 * A063986 Numbers k that divide Sum_{j=1..k} A051953(j) where A051953(j) = j - Phi(j). Arithmetic mean of first k cototient values is an integer.
 * @author Sean A. Irvine
 */
public class A063986 extends A051953 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mSum = mSum.add(super.next());
      if (mSum.mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

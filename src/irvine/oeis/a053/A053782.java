package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A053782 Numbers k such that the sum of the first k composite numbers is prime.
 * @author Sean A. Irvine
 */
public class A053782 extends A002808 {

  private long mN = 0;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mA = mA.add(super.next());
      ++mN;
      if (mA.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

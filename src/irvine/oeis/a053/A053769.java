package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A053769 Squares arising in A053768.
 * @author Sean A. Irvine
 */
public class A053769 extends A002808 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mA = mA.add(super.next());
      if (mA.isSquare()) {
        return mA;
      }
    }
  }
}

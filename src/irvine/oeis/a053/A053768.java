package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A053768 Numbers n such that sum of the first n composite numbers is a perfect square.
 * @author Sean A. Irvine
 */
public class A053768 extends A002808 {

  private Z mA = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mA = mA.add(super.next());
      if (mA.isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}

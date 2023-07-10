package irvine.oeis.a354;
// manually parity at 2023-07-10 07:08

import irvine.math.z.Z;
import irvine.oeis.a344.A344005;

/**
 * A354919 Positions of odd terms in A344005.
 * @author Georg Fischer
 */
public class A354919 extends A344005 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().testBit(0)) {
        return Z.valueOf(mN);
      }
    }
  }
}

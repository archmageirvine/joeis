package irvine.oeis.a354;
// manually parity at 2023-07-10 07:08

import irvine.math.z.Z;
import irvine.oeis.a182.A182665;

/**
 * A354921 Positions of odd terms in A182665.
 * @author Georg Fischer
 */
public class A354921 extends A182665 {

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

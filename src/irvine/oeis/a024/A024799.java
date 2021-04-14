package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000408;

/**
 * A024799 Positions of odd numbers in A000408.
 * @author Sean A. Irvine
 */
public class A024799 extends A000408 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().isOdd()) {
        return Z.valueOf(mN);
      }
    }
  }
}

package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a003.A003072;

/**
 * A024969 Positions of odd numbers in A003072.
 * @author Sean A. Irvine
 */
public class A024969 extends A003072 {

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

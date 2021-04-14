package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024413 Positions of odd numbers in A024412.
 * @author Sean A. Irvine
 */
public class A024413 extends A024412 {

  private long mN = -1;

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

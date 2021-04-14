package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024672 Positions of odd numbers in A024670 (distinct sums of cubes of distinct positive integers).
 * @author Sean A. Irvine
 */
public class A024672 extends A024670 {

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

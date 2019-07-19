package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024672 Positions of odd numbers in <code>A024670</code> (distinct sums of cubes of distinct positive integers).
 * @author Sean A. Irvine
 */
public class A024672 extends A024670 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (!super.next().isEven()) {
        return Z.valueOf(mN);
      }
    }
  }
}

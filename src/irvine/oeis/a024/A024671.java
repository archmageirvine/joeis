package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024671 Positions of even numbers in <code>A024670</code> (distinct sums of cubes of distinct positive integers).
 * @author Sean A. Irvine
 */
public class A024671 extends A024670 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().isEven()) {
        return Z.valueOf(mN);
      }
    }
  }
}

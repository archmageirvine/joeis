package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031072 Position of <code>n-th 4</code> in <code>A031067</code>.
 * @author Sean A. Irvine
 */
public class A031072 extends A031067 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.FOUR.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}


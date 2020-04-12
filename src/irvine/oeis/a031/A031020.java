package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031020 Position of <code>n-th 1</code> in <code>A031018</code>.
 * @author Sean A. Irvine
 */
public class A031020 extends A031018 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.ONE.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}


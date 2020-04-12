package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031029 Position of <code>n-th 1</code> in <code>A031027</code>.
 * @author Sean A. Irvine
 */
public class A031029 extends A031027 {

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


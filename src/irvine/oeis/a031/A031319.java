package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031319 Position of <code>n-th 6</code> in <code>A031312</code>.
 * @author Sean A. Irvine
 */
public class A031319 extends A031312 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.SIX.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}


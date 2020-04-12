package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031009 Position of <code>n-th 1</code> in <code>A031007</code>.
 * @author Sean A. Irvine
 */
public class A031009 extends A031007 {

  private long mN = -1;

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


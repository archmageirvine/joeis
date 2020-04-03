package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030488 Position of <code>n-th 1</code> in <code>A030298</code>.
 * @author Sean A. Irvine
 */
public class A030488 extends A030298 {

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


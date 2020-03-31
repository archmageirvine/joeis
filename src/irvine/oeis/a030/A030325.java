package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030325 Position of <code>n-th 0</code> in <code>A030324</code>.
 * @author Sean A. Irvine
 */
public class A030325 extends A030324 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.ZERO.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}


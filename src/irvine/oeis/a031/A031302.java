package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031302 Position of <code>n-th 3</code> in <code>A031298</code>.
 * @author Sean A. Irvine
 */
public class A031302 extends A031298 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.THREE.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}


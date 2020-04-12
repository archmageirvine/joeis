package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031011 Position of <code>n-th 3</code> in <code>A031007</code>.
 * @author Sean A. Irvine
 */
public class A031011 extends A031007 {

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


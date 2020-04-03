package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030499 Position of <code>n-th 3</code> in <code>A030496</code>.
 * @author Sean A. Irvine
 */
public class A030499 extends A030496 {

  private long mN = 0;

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


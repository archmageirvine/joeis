package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030417 Position of <code>n-th 3</code> in <code>A030413</code>.
 * @author Sean A. Irvine
 */
public class A030417 extends A030413 {

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


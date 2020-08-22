package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030608 Position of n-th 3 in A030604.
 * @author Sean A. Irvine
 */
public class A030608 extends A030604 {

  private long mN = 0;
  {
    super.next();
    super.next();
  }

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


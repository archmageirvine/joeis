package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030608 Position of <code>n-th 3</code> in <code>A030604</code>.
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


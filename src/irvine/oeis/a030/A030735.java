package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030735 <code>s(n)=3</code>, where <code>s=A030727</code>.
 * @author Sean A. Irvine
 */
public class A030735 extends A030727 {

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


package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030755 Numbers n such that <code>s(n)=3</code>, where <code>s=A030747</code>.
 * @author Sean A. Irvine
 */
public class A030755 extends A030747 {

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


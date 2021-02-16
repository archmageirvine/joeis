package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030755 Numbers k such that A030747(k) = 3.
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


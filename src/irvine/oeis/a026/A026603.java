package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026603 Numbers k such that A026600(k) = 3.
 * @author Sean A. Irvine
 */
public class A026603 extends A026600 {

  private long mN = 0;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!Z.THREE.equals(super.next()));
    return Z.valueOf(mN);
  }
}

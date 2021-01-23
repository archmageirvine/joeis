package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026603 Numbers n such that s(n) = 3, where s = A026600.
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

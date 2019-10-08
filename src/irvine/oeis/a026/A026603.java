package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026603 Numbers n such that <code>s(n) = 3</code>, where s <code>= A026600</code>.
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

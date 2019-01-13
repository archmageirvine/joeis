package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000792.
 * @author Sean A. Irvine
 */
public class A000792 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    final int n = ++mN / 3;
    switch (mN % 3) {
    case 0:
      return Z.THREE.pow(n);
    case 1:
      return mN == 1 ? Z.ONE : Z.THREE.pow(n - 1).shiftLeft(2);
    default:
      return Z.THREE.pow(n).multiply2();
    }
  }
}

package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A047938 Number of ways to label points of an n X n grid with 3 colors, up to rotational symmetry.
 * @author Sean A. Irvine
 */
public class A047938 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.THREE.pow((long) mN * mN).add(Z.THREE.pow(((long) mN * mN + 3) / 4).multiply2()).add(Z.THREE.pow(((long) mN * mN + 1) / 2)).shiftRight(2);
  }
}

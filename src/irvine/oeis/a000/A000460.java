package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000460 Eulerian numbers <code>(Euler</code>'s triangle: column <code>k=3</code> of <code>A008292</code>, column <code>k=2</code> of A173018).
 * @author Sean A. Irvine
 */
public class A000460 implements Sequence {

  private int mN = 2;

  @Override
  public Z next() {
    ++mN;
    return Z.THREE.pow(mN)
      .subtract(Z.ONE.shiftLeft(mN).multiply(mN + 1))
      .add((long) mN * (mN + 1) / 2);
  }
}

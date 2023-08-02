package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A054751 Number of inequivalent n X n matrices over GF(4) under action of dihedral group of the square D_4.
 * @author Sean A. Irvine
 */
public class A054751 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(2L * mN * mN)
      .add((mN & 1) == 1
        ? Z.ONE.shiftLeft(((long) mN * mN + 3) / 2 + 1).add(Z.ONE.shiftLeft((long) mN * mN + 1)).add(Z.ONE.shiftLeft((long) mN * mN + mN + 2))
        : Z.ONE.shiftLeft((long) mN * mN / 2 + 1).add(Z.THREE.shiftLeft((long) mN * mN)).add(Z.ONE.shiftLeft((long) mN * mN + mN + 1)))
      .divide(8);
  }
}

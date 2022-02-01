package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054247 Number of n X n binary matrices under action of dihedral group of the square D_4.
 * @author Sean A. Irvine
 */
public class A054247 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(mN * mN).add(Z.ONE.shiftLeft((mN * mN + 7) / 4))
      .add((mN & 1) == 1
        ? Z.ONE.shiftLeft((mN * mN + 1) / 2).add(Z.ONE.shiftLeft((mN * mN + mN + 4) / 2))
        : Z.THREE.shiftLeft(mN * mN / 2).add(Z.ONE.shiftLeft((mN * mN + mN + 2) / 2)))
      .divide(8);
  }
}

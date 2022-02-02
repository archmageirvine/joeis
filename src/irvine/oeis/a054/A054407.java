package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054407 Number of asymmetric n X n binary matrices under action of dihedral group of the square D_4.
 * @author Sean A. Irvine
 */
public class A054407 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z t = Z.ONE.shiftLeft(mN * mN);
    if ((mN & 1) == 0) {
      t = t.subtract(Z.ONE.shiftLeft((mN * mN + mN) / 2 + 1))
        .subtract(Z.THREE.shiftLeft(mN * mN / 2))
        .add(Z.ONE.shiftLeft(mN * mN / 4 + 1))
        .add(Z.ONE.shiftLeft((mN * mN + 2 * mN) / 4 + 1));
    } else {
      t = t.subtract(Z.ONE.shiftLeft((mN * mN + mN) / 2 + 2))
        .subtract(Z.ONE.shiftLeft((mN * mN + 1) / 2))
        .add(Z.ONE.shiftLeft((mN * mN + 2 * mN + 1) / 4 + 2));
    }
    return t.shiftRight(3);
  }
}

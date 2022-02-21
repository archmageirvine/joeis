package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054739 Number of inequivalent n X n matrices over GF(3) under action of dihedral group of the square D_4.
 * @author Sean A. Irvine
 */
public class A054739 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Z t = Z.THREE.pow((mN * mN + mN) / 2);
    return Z.THREE.pow(mN * mN)
      .add((mN & 1) == 1
        ? Z.THREE.pow((mN * mN + 3) / 4).multiply2().add(Z.THREE.pow((mN * mN + 1) / 2)).add(t.multiply(4))
        : Z.THREE.pow((mN * mN) / 4).multiply2().add(Z.THREE.pow((mN * mN) / 2 + 1)).add(t.multiply2()))
      .divide(8);
  }
}

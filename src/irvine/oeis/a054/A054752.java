package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054752 Number of inequivalent n X n matrices over GF(5) under action of dihedral group of the square D_4.
 * @author Sean A. Irvine
 */
public class A054752 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.FIVE.pow(mN * mN)
      .add((mN & 1) == 1
        ? Z.FIVE.pow((mN * mN + 3) / 4).multiply2().add(Z.FIVE.pow((mN * mN + 1) / 2)).add(Z.FIVE.pow((mN * mN + mN) / 2).multiply(4))
        : Z.FIVE.pow(mN * mN / 4).multiply2().add(Z.FIVE.pow(mN * mN / 2).multiply(3)).add(Z.FIVE.pow((mN * mN + mN) / 2).multiply2()))
      .divide(8);
  }
}

package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027432 Related to sorting procedure studied by West: number of permutations that are both sorted (i.e., obtainable as output of the sorting procedure) and one-stack sortable.
 * @author Sean A. Irvine
 */
public class A027432 implements Sequence {

  private Z mA = Z.ONE;
  private Z mB = Z.ONE;
  private Z mC = Z.TWO;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return Z.ONE;
    } else if (mN > 3) {
      final Z t = mC.multiply(Z.valueOf(1680 * mN)
        .subtract(1294).multiply(mN)
        .subtract(10977).multiply(mN)
        .add(16676).multiply(mN)
        .subtract(3843).multiply(mN)
        .subtract(2602).multiply(mN)
        .add(720)).multiply2()
        .add(mB.multiply(Z.valueOf(768 * mN)
          .subtract(3872).multiply(mN)
          .add(3560).multiply(mN)
          .add(6195).multiply(mN)
          .subtract(11498).multiply(mN)
          .add(6887).multiply(mN)
          .subtract(2520)).multiply(4))
        .subtract(mA.multiply(32)
          .multiply(mN).multiply(2 * mN - 5)
          .multiply(4 * mN - 11).multiply(4 * mN - 9)
          .multiply(Z.valueOf(24 * mN).add(47).multiply(mN).subtract(67)))
        .divide(Z.valueOf(24 * mN).subtract(1).multiply(mN).subtract(90))
        .divide(3 * mN + 2).divide(3 * mN + 1)
        .divide(mN + 1).divide(mN - 1).divide(3);
      mA = mB;
      mB = mC;
      mC = t;
    }
    return mC;
  }
}

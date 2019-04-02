package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002464 Hertzsprung's problem: ways to arrange n non-attacking kings on an n X n board, with 1 in each row and column. Also number of permutations of length n without rising or falling successions.
 * @author Sean A. Irvine
 */
public class A002464 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.ONE;
  private Z mC = Z.ZERO;
  private Z mD = Z.ZERO;

  @Override
  public Z next() {
    if (++mN <= 3) {
      return mN <= 1 ? Z.ONE : Z.ZERO;
    }
    final Z t = mD.multiply(mN + 1)
      .subtract(mC.multiply(mN - 2))
      .subtract(mB.multiply(mN - 5))
      .add(mA.multiply(mN - 3));
    mA = mB;
    mB = mC;
    mC = mD;
    mD = t;
    return t;
  }
}


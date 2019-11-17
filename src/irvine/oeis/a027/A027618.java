package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027618 <code>c(i,j)</code> is cost of evaluation of edit distance of two strings with lengths i and j, when you use recursion (every call has a unit cost, other computations are free); sequence gives <code>c(n,n)</code>.
 * @author Sean A. Irvine
 */
public class A027618 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;
  private Z mC = Z.FOUR;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    } else if (mN == 1) {
      return Z.FOUR;
    } else {
      final Z t = mC.multiply(2 * mN - 1).multiply(7 * mN - 10)
        .subtract(mB.multiply(2 * mN - 3).multiply(7 * mN - 4))
        .add(mA.multiply(2 * mN - 1).multiply(mN - 2))
        .divide(mN).divide(2 * mN - 3);
      mA = mB;
      mB = mC;
      mC = t;
    }
    return mC;
  }
}

package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000179 M\u00e9nage numbers: a(0) = 1, a(1) = -1, and for n &gt;= 2, a(n) = number of permutations s of [0, ..., n-1] such that s(i) != i and s(i) != i+1 (mod n) for all i.
 * @author Sean A. Irvine
 */
public class A000179 extends Sequence0 {

  protected long mN = -1;
  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN < 4) {
      if (mN == 1) {
        return Z.NEG_ONE;
      }
      return mN == 0 || mN == 3 ? Z.ONE : Z.ZERO;
    }
    final Z r = mB.multiply(mN * mN - 2 * mN)
      .add(mA.multiply(mN))
      .add((mN & 1) == 0 ? -4 : 4)
      .divide(mN - 2);
    mA = mB;
    mB = r;
    return r;
  }
}


package irvine.oeis.a065;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a001.A001622;

/**
 * A065019 Let phi be the golden number {1+sqrt(5)}/2 (A001622), let phi(n) be the number phi written in base 10 but truncated to n decimal digits. Sequence gives number of 1's at the beginning of the continued fraction expansion of phi(n).
 * @author Sean A. Irvine
 */
public class A065019 extends Sequence0 {

  private final Sequence mPhi = new A001622();
  private Z mA = Z.ZERO;
  private Z mT = null;

  @Override
  public Z next() {
    mA = mA.multiply(10).add(mPhi.next());
    mT = mT == null ? Z.ONE : mT.multiply(10);
    Q v = new Q(mA, mT);
    long cnt = 0;
    while (Z.ONE.equals(v.floor())) {
      ++cnt;
      v = v.subtract(v.floor());
      if (v.isZero()) {
        break;
      }
      v = v.reciprocal();
    }
    return Z.valueOf(cnt);
  }
}


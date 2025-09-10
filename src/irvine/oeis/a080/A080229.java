package irvine.oeis.a080;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a001.A001622;

/**
 * A080229 Number of terms in the continued fraction for x, where x is the Golden ratio (phi=(1+sqrt(5))/2) truncated to n decimal digits.
 * @author Sean A. Irvine
 */
public class A080229 extends Sequence0 {

  private final Sequence mPhi = new A001622();
  private Z mA = Z.ZERO;
  private Z mT = null;

  @Override
  public Z next() {
    mA = mA.multiply(10).add(mPhi.next());
    mT = mT == null ? Z.ONE : mT.multiply(10);
    Q v = new Q(mA, mT);
    long cnt = 0;
    while (true) {
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


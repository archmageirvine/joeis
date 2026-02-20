package irvine.oeis.a081;

import java.util.List;

import irvine.math.ContinuedFractionUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001622;

/**
 * A081838 Let z(n) be the golden ratio truncated to n decimal digits; sequence gives n such that the last element in the continued fraction for z(n) is 2.
 * @author Sean A. Irvine
 */
public class A081838 extends Sequence1 {

  private final Sequence mPhi = new A001622();
  private Z mPhiTrunc = Z.ZERO;
  private Z mA = null;
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mPhiTrunc = mPhiTrunc.multiply(10).add(mPhi.next());
      mA = mA == null ? Z.ONE : mA.multiply(10);
      final List<Z> cf = ContinuedFractionUtils.continuedFraction(new Q(mPhiTrunc, mA));
      if (cf.get(cf.size() - 1).equals(Z.TWO)) {
        return Z.valueOf(mN);
      }
    }
  }
}

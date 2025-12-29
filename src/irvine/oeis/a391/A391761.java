package irvine.oeis.a391;

import java.util.ArrayList;
import java.util.List;

import irvine.math.ContinuedFractionUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A391761 Continued fraction that converts to its own decimal expansion; the sequence becomes strictly increasing when all zero terms are removed.
 * @author Sean A. Irvine
 */
public class A391761 extends Sequence0 {

  private final StringBuilder mS = new StringBuilder("329");
  private final List<Z> mA = new ArrayList<>();
  private int mLen = 3;
  private Z mPrev = Z.valueOf(29);

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.add(Z.ZERO);
    } else if (mA.size() == 1) {
      mA.add(Z.THREE);
    } else if (mA.size() == 2) {
      mA.add(Z.valueOf(29));
    } else {
      final Q q = ContinuedFractionUtils.toQ(mA);
      Q s = q.multiply(Z.TEN.pow(mLen)).frac();
      Z t = Z.ZERO;
      while (t.compareTo(mPrev) <= 0) {
        s = s.multiply(10);
        t = t.multiply(10).add(s.toZ());
        s = s.frac();
        ++mLen;
        if (t.isZero()) {
          break;
        }
      }
      mA.add(t);
      while (true) {
        final Z u = ContinuedFractionUtils.toQ(mA).multiply(Z.TEN.pow(mLen)).toZ();
        final Z v = new Z(mS.toString() + t);
        final int c = u.compareTo(v);
        if (c == 0) {
          break;
        }
        if (c > 0) {
          t = t.add(1);
        } else {
          t = t.subtract(1);
        }
        mA.set(mA.size() - 1, t);
      }
      mS.append(t);
      if (!t.isZero()) {
        mPrev = t;
      }
    }
    return mA.get(mA.size() - 1);
  }
}


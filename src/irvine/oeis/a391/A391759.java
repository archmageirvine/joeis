package irvine.oeis.a391;

import java.util.ArrayList;
import java.util.List;

import irvine.math.ContinuedFractionUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A391759 Strictly increasing continued fraction that produces its own decimal expansion (no leading zeros).
 * @author Sean A. Irvine
 */
public class A391759 extends Sequence0 {

  private final List<Z> mA = new ArrayList<>();
  private int mLen = 3;

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
      final Z prev = mA.get(mA.size() - 1);
      Z t = Z.ZERO;
      while (t.compareTo(prev) <= 0) {
        s = s.multiply(10);
        t = t.multiply(10).add(s.toZ());
        s = s.frac();
        ++mLen;
      }
      // Handle 0s
      s = s.multiply(10);
      while (s.toZ().isZero()) {
        t = t.multiply(10);
        s = s.frac().multiply(10);
        ++mLen;
      }
      mA.add(t);
    }
    return mA.get(mA.size() - 1);
  }
}


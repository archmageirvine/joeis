package irvine.oeis.a072;

import java.util.ArrayList;
import java.util.List;

import irvine.math.ContinuedFractionUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072140.
 * @author Sean A. Irvine
 */
public class A072193 extends Sequence0 {

  private long mN = 2;
  private long mM = 0;
  private int mR = 0;
  private final List<Z> mA = new ArrayList<>();

  @Override
  public Z next() {
    if (++mR >= mA.size()) {
      if (++mM >= mN) {
        ++mN;
        mM = 1;
      }
      mA.clear();
      mR = 1; // NOT 0 because continued fraction returns with a leading 0
      mA.addAll(ContinuedFractionUtils.continuedFraction(new Q(mM, mN)));
    }
    return mA.get(mR);
  }
}

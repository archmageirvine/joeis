package irvine.oeis.a084;

import java.util.HashSet;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084337 Rearrangement of positive integers so that the successive ratios (of the larger to the smaller term) are all distinct integers. a(m)/a(m-1) = a(k)/a(k-1) iff m = k (assuming a(m) &gt; a(m-1), otherwise the ratio a(m-1)/a(m) is to be considered). Priority is given to smallest number not included earlier rather than to the successive ratio that has not occurred earlier.
 * @author Sean A. Irvine
 */
public class A084337 extends Sequence1 {

  private Z mA = null;
  private final HashSet<Z> mUsed = new HashSet<>();
  private final HashSet<Z> mForbiddenRatios = new HashSet<>();

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      Z k = Z.ONE;
      while (true) {
        k = k.add(1);
        if (!mUsed.contains(k)) {
          final Q r = k.compareTo(mA) > 0 ? new Q(k, mA) : new Q(mA, k);
          if (r.isInteger() && mForbiddenRatios.add(r.toZ())) {
            mA = k;
            break;
          }
        }
      }
    }
    mUsed.add(mA);
    return mA;
  }
}

package irvine.oeis.a067;

import java.util.ArrayList;

import irvine.math.q.HarmonicSequence;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067710 a(n) = n! * Sum_{k|n} (Sum_{j=1..k} 1/j); the k-sum is over the positive divisors, k, of n.
 * @author Sean A. Irvine
 */
public class A067710 extends Sequence1 {

  private final HarmonicSequence mHarmonicSequence = new HarmonicSequence();
  private final ArrayList<Q> mH = new ArrayList<>();
  private int mN = 0;
  private Z mF = Z.ONE;
  {
    mH.add(Q.ZERO);
  }

  private Q h(final int k) {
    while (k >= mH.size()) {
      mH.add(mHarmonicSequence.nextQ());
    }
    return mH.get(k);
  }

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return Rationals.SINGLETON.sumdiv(mN, this::h).multiply(mF).toZ();
  }
}

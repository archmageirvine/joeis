package irvine.oeis.a067;

import java.util.HashSet;
import java.util.Set;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067993.
 * @author Sean A. Irvine
 */
public class A067993 extends Sequence1 {

  private A067992 mRatios = new A067992();
  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final HashSet<Q> required = new HashSet<>();
    for (long k = 1; k < mN; ++k) {
      required.add(new Q(k, mN));
    }
    if (mRatios.getRatios().containsAll(required)) {
      // We need to start again because we already had everything
      // This corresponds to values of n where a(n) decreases
      mRatios = new A067992();
      mM = -1;
    }
    while (!required.isEmpty()) {
      ++mM;
      mRatios.next();
      final Set<Q> r = mRatios.getRatios();
      required.removeIf(r::contains);
    }
    return Z.valueOf(mM);
  }
}


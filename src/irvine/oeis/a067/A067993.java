package irvine.oeis.a067;

import java.util.HashSet;
import java.util.Set;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067993 Consider the sequence of ratios min(t(n-1)/t(n), t(n)/t(n-1)), n=2,3,4,..., where the t(n) are the terms of A067992. Let m be the smallest integer such that all fractions 1/n, 2/n, ..., (n-1)/n have appeared when we reach A067992(m); this sequence gives the values of m; set a(n)=0 if some fraction i/n never appears.
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


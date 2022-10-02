package irvine.oeis.a059;

import java.util.HashSet;
import java.util.Set;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059686 Grimm numbers (1): a(n) = largest k so that for each m in {n+1, n+2, ..., n+k} there corresponds a different prime factor p_m.
 * @author Sean A. Irvine
 */
public class A059686 implements Sequence {

  private long mN = 0;
  private long mBestK = 0;

  private void search(final Set<Long> used, final int k) {
    if (k > mBestK) {
      mBestK = k;
    }
    for (final Z pp : Jaguar.factor(mN + k + 1).toZArray()) {
      final long p = pp.longValue();
      if (used.add(p)) {
        search(used, k + 1);
        used.remove(p);
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mBestK = 0;
    search(new HashSet<>(), 0);
    return Z.valueOf(mBestK);
  }
}

package irvine.oeis.a060;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060741 Number of divisors of 2n which are also differences between consecutive divisors of 2n (ordered by size).
 * @author Sean A. Irvine
 */
public class A060741 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    Z prev = Z.ZERO;
    final HashSet<Z> diffs = new HashSet<>();
    final Z[] divs = Jaguar.factor(mN).divisorsSorted();
    for (final Z d : divs) {
      if (!prev.isZero()) {
        diffs.add(d.subtract(prev));
      }
      prev = d;
    }
    long cnt = 0;
    for (final Z d : divs) {
      if (diffs.contains(d)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

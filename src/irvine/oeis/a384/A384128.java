package irvine.oeis.a384;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A384128 allocated for Pietro Tiaraju Giavarina dos Santos.
 * @author Sean A. Irvine
 */
public class A384128 extends Sequence1 {

  private long mN = 0;

  private long circularDifference(final long m) {
    final String s = String.valueOf(m);
    long v = 0;
    for (int k = 0; k < s.length(); ++k) {
      v *= 10;
      v += Math.abs(s.charAt((k + 1) % s.length()) - s.charAt(k));
    }
    return v;
  }

  @Override
  public Z next() {
    long m = ++mN;
    long cnt = 0;
    while (!Predicates.REPDIGIT.is(m)) {
      ++cnt;
      m = circularDifference(m);
    }
    return Z.valueOf(cnt);
  }
}

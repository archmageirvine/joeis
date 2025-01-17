package irvine.oeis.a074;

import java.util.HashSet;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074250 Smallest p&gt;1 for which n^p ends in n, or -1 if no such p exists. The smallest p for which n is a p-morphic number.
 * @author Sean A. Irvine
 */
public class A074250 extends Sequence1 {

  private long mN = 0;
  private long mM = 10;

  @Override
  public Z next() {
    if (++mN == mM) {
      mM *= 10;
    }
    final HashSet<Long> seen = new HashSet<>();
    long k = 1;
    while (true) {
      final long r = LongUtils.modPow(mN, ++k, mM);
      if (r == mN) {
        return Z.valueOf(k);
      } else if (!seen.add(r)) {
        return Z.NEG_ONE;
      }
    }
  }
}

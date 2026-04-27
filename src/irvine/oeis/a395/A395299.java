package irvine.oeis.a395;

import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001597;
import irvine.oeis.a088.A088865;

/**
 * A395299 Number of ways of expressing A001597(n) = A088865(k) for some k.
 * @author Sean A. Irvine
 */
public class A395299 extends A001597 {

  private final Sequence mS = new A088865();
  private final TreeMap<Z, Long> mCounts = new TreeMap<>();
  private long mM = 0;

  @Override
  public Z next() {
    final Z n = super.next();
    final long t = n.longValueExact();
    while (mM < t) {
      mCounts.merge(mS.next(), 1L, Long::sum);
      ++mM;
    }
    final Long r = mCounts.remove(n);
    return r == null ? Z.ZERO : Z.valueOf(r);
  }
}

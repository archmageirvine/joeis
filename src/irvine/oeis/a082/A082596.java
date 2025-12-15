package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a060.A060863;
import irvine.oeis.a077.A077389;
import irvine.util.array.LongDynamicLongArray;

/**
 * A082596 a(n) is the number of values of k such that A077389(k) = A060863(n).
 * @author Sean A. Irvine
 */
public class A082596 extends A060863 {

  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private final Sequence mS = new A077389();

  @Override
  public Z next() {
    final long n = super.next().longValueExact();
    mCounts.increment(mS.next().longValueExact());
    mCounts.increment(mS.next().longValueExact());
    return Z.valueOf(mCounts.get(n));
  }
}

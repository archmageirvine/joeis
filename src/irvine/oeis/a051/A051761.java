package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000142;
import irvine.oeis.closure.DistinctAdditiveClosureSequence;

/**
 * A051761 Numbers that are simultaneously a sum of distinct factorials and of the form a^b with b &gt;= 2.
 * @author Sean A. Irvine
 */
public class A051761 extends Sequence1 {

  private final Sequence mA = new DistinctAdditiveClosureSequence(new A000142());
  private Z mPrev = null;

  @Override
  public Z next() {
    if (mPrev == null) {
      mPrev = Z.ZERO;
      return Z.ZERO;
    }
    while (true) {
      final Z t = mA.next();
      final Z r = t.isPower();
      if (!t.equals(mPrev) && (Z.ONE.equals(t) || (r != null && t.auxiliary() >= 2))) {
        mPrev = t;
        return t;
      }
    }
  }
}

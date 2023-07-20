package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.closure.DistinctAdditiveClosureSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000142;

/**
 * A051760 Numbers that are simultaneously a sum of distinct factorials and of the form a^b with b &gt;= 3.
 * @author Sean A. Irvine
 */
public class A051760 extends Sequence1 {

  private final Sequence mA = new DistinctAdditiveClosureSequence(new A000142().skip(1));
  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z t = mA.next();
      final Z r = t.isPower();
      if (!t.equals(mPrev) && (Z.ONE.equals(t) || (r != null && t.auxiliary() >= 3))) {
        mPrev = t;
        return t;
      }
    }
  }
}

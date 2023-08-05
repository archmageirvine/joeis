package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A065006 Integers for which the periodic part of the continued fraction for the square root of n begins with 3.
 * @author Sean A. Irvine
 */
public class A065006 extends Sequence1 {

  private int mN = 10;

  @Override
  public Z next() {
    while (true) {
      final ContinuedFractionOfSqrtSequence seq = new ContinuedFractionOfSqrtSequence(1, ++mN);
      if (seq.getPeriodLength() > 0 && seq.getPeriodElement(0) == 3) {
        return Z.valueOf(mN);
      }
    }
  }
}

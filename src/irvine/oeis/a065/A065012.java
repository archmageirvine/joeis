package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A065012 Integers for which the periodic part of the continued fraction for the square root of n begins with 9.
 * @author Sean A. Irvine
 */
public class A065012 extends Sequence1 {

  private int mN = 82;

  @Override
  public Z next() {
    while (true) {
      final ContinuedFractionOfSqrtSequence seq = new ContinuedFractionOfSqrtSequence(1, ++mN);
      if (seq.getPeriodLength() > 0 && seq.getPeriodElement(0) == 9) {
        return Z.valueOf(mN);
      }
    }
  }
}

package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005811;

/**
 * A394905 allocated for Vincenzo Manto.
 * @author Sean A. Irvine
 */
public class A394905 extends Sequence1 {

  private final DirectSequence mRuns = new A005811();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final long runs = mRuns.a(mN).longValue();
    long k = mN;
    while (true) {
      if (Long.bitCount(++k ^ mN) == runs && mRuns.a(k).compareTo(runs) > 0) {
        return Z.valueOf(k);
      }
    }
  }
}

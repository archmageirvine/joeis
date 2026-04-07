package irvine.oeis.a394;

import java.util.ArrayList;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394688 Smallest number that differs from all previous terms at at least half of its binary digit positions; a(1) = 0.
 * @author Sean A. Irvine
 */
public class A394688 extends Sequence1 {

  private final ArrayList<Long> mA = new ArrayList<>();
  private long mM = 0;

  private boolean is(final long k) {
    final long len = Functions.DIGIT_LENGTH.l(2, k);
    for (int j = mA.size() - 1; j >= 0; --j) {
      if (2 * Long.bitCount(mA.get(j) ^ k) < len) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.add(0L);
      return Z.ZERO;
    }
    while (!is(++mM)) {
      // do nothing
    }
    mA.add(mM);
    return Z.valueOf(mM);
  }
}

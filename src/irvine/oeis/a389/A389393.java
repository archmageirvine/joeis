package irvine.oeis.a389;

import java.util.Arrays;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005117;

/**
 * A081210.
 * @author Sean A. Irvine
 */
public class A389393 extends Sequence1 {

  private final Sequence mS = new A005117();
  private long[] mA = new long[0];
  private long mM = 1;

  private boolean is(final long n) {
    for (int k = 1; k <= mA.length; ++k) {
      final long v = n + mA[k - 1];
      if (!Predicates.SQUARE_FREE.is(v) || Functions.BIG_OMEGA.l(v) != k) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    mA = Arrays.copyOf(mA, mA.length + 1);
    mA[mA.length - 1] = mS.next().longValueExact();
    while (!is(mM)) {
      ++mM;
    }
    return Z.valueOf(mM);
  }
}

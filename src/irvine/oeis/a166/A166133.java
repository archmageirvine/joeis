package irvine.oeis.a166;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A166133 After initial 1,2,4, a(n+1) is the smallest divisor of a(n)^2-1 that has not yet appeared in the sequence.
 * @author Sean A. Irvine
 */
public class A166133 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private final HashSet<Z> mLargeUsed = new HashSet<>();
  private Z mA = null;

  private void use(final Z n) {
    final long v = n.longValueExact();
    if (v >= 1L << 40) {
      mLargeUsed.add(n);
      return;
    }
    mUsed.set(v);
  }

  private boolean isUsed(final Z n) {
    final long v = n.longValueExact();
    if (v >= 1L << 40) {
      return mLargeUsed.contains(n);
    }
    return mUsed.isSet(v);
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else if (Z.ONE.equals(mA)) {
      mA = Z.TWO;
    } else if (Z.TWO.equals(mA)) {
      mA = Z.FOUR;
    } else {
      // Use a naive search for the divisor
      final Z n = mA.square().subtract(1);
      boolean found = false;
      for (final Z dd : Jaguar.factor(n).divisorsSorted()) {
        if (!isUsed(dd)) {
          mA = dd;
          found = true;
          break;
        }
      }
      if (!found) {
        throw new UnsupportedOperationException();
      }
    }
    use(mA);
    return mA;
  }
}

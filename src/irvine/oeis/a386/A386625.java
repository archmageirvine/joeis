package irvine.oeis.a386;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicIntArray;

/**
 * A386625 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A386625 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  // Following list keeps where we up to in each column (needed to handle duplicates)
  private final DynamicIntArray mColIndex = new DynamicIntArray();

  private boolean isOk(final int n, final Z t) {
    for (int k = 1; k < n; ++k) {
      final Z[] qr = t.divideAndRemainder(k);
      if (qr[1].isZero() && Predicates.FIBONACCI.is(qr[0])) {
        return false;
      }
    }
    return true;
  }

  private Z t(final int n) {
    int k = mColIndex.get(n) + 2; // +2 for offset into Fibonacci
    if (n == 1) {
      mColIndex.increment(1);
      return Functions.FIBONACCI.z(k);
    }
    while (true) {
      final Z t = Functions.FIBONACCI.z(k).multiply(n);
      if (isOk(n, t)) {
        mColIndex.set(n, k - 1); // i.e., k + 1 - 2
        return t;
      }
      ++k;
    }
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return t(mM + 1);
  }
}


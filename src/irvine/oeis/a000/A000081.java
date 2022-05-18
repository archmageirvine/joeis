package irvine.oeis.a000;

import irvine.factor.factor.Jaguar;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.util.array.DynamicArray;

/**
 * A000081 Number of unlabeled rooted trees with n nodes (or connected functions with a fixed point).
 * @author Sean A. Irvine
 */
public class A000081 extends MemorySequence {

  protected static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final DynamicArray<Z> mS = new DynamicArray<>();

  private Z sum(final int k) {
    final Z r = mS.get(k);
    if (r != null) {
      return r;
    }
    Z sum = Z.ZERO;
    if (k == 1) {
      sum = Z.ONE;
    } else {
      for (final Z t : Jaguar.factor(k).divisors()) {
        sum = sum.add(t.multiply(get(t.intValue())));
      }
    }
    mS.set(k, sum);
    return sum;
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ZERO;
    } else if (n == 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k < n; ++k) {
      sum = sum.add(get(n - k).multiply(sum(k)));
    }
    return sum.divide(n - 1);
  }
}


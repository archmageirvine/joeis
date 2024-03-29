package irvine.oeis.a007;

import java.util.ArrayList;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A007649 Number of set-like molecular species of degree n.
 * @author Sean A. Irvine
 */
public class A007649 extends MemorySequence {

  // After Joerg Arndt

  protected final ArrayList<Z> mA = new ArrayList<>();

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 1) {
      mA.add(Z.valueOf(n));
      return Z.ONE;
    }
    Z sumA = Z.ZERO;
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final int d = dd.intValue();
      if (d < n) {
        sumA = sumA.add(a(d));
      }
    }
    mA.add(sumA);
    Z sumM = Z.ZERO;
    for (int k = 1; k <= n; ++k) {
      Z t = Z.ZERO;
      for (final Z dd : Jaguar.factor(k).divisors()) {
        t = t.add(dd.multiply(mA.get(dd.intValue())));
      }
      sumM = sumM.add(t.multiply(a(n - k)));
    }
    return sumM.divide(n);
  }
}

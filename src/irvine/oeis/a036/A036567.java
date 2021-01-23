package irvine.oeis.a036;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A036567 Basic numbers used in Sedgewick-Incerpi upper bound for shell sort.
 * @author Sean A. Irvine
 */
public class A036567 extends MemorySequence {

  private static final Q C = new Q(5, 2);

  private boolean isOk(final Z m) {
    for (final Z t : this) {
      if (!Z.ONE.equals(m.gcd(t))) {
        return false;
      }
    }
    return true;
  }

  @Override
  protected Z computeNext() {
    final int n = size() + 1;
    Z m = C.pow(n).ceiling();
    while (!isOk(m)) {
      m = m.add(1);
    }
    return m;
  }
}

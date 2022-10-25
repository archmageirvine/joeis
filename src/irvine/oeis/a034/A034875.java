package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A034875 Smallest integer not the sum of powers of some earlier terms.
 * @author Sean A. Irvine
 */
public class A034875 extends MemorySequence {

  {
    setOffset(1);
  }

  private boolean is(final Z n, final int index) {
    if (n.isZero()) {
      return true;
    }
    if (index < 0) {
      return false;
    }
    Z t = Z.ONE;
    final Z v = a(index);
    while (t.compareTo(n) <= 0) {
      if (is(n.subtract(t), index - 1)) {
        return true;
      }
      if (index == 0) {
        break; // i.e. v == 1
      }
      t = t.multiply(v);
    }
    return is(n, index - 1);
  }

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      return Z.ONE;
    }
    Z m = a(size() - 1);
    while (true) {
      m = m.add(1);
      if (!is(m, size() - 1)) {
        return m;
      }
    }
  }
}

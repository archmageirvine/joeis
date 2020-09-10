package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A034875 Smallest integer not the sum of powers of some earlier terms.
 * @author Sean A. Irvine
 */
public class A034875 extends MemorySequence {

  private boolean is(final Z n, final int index) {
    if (Z.ZERO.equals(n)) {
      return true;
    }
    if (index < 0) {
      return false;
    }
    Z t = Z.ONE;
    final Z v = get(index);
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
    if (isEmpty()) {
      return Z.ONE;
    }
    Z m = get(size() - 1);
    while (true) {
      m = m.add(1);
      if (!is(m, size() - 1)) {
        return m;
      }
    }
  }
}

package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A037100 Lexically first set of (even) numbers, beginning with 4, such that for any two different terms, a(i) + a(j) + 1 is prime.
 * @author Sean A. Irvine
 */
public class A037100 extends MemorySequence {

  {
    setOffset(1);
  }

  private boolean isOk(final Z n) {
    for (final Z t : this) {
      if (!t.add(n).isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      return Z.FOUR;
    }
    Z n = get(size() - 1).add(1); // odd
    while (true) {
      n = n.add(2);
      if (isOk(n)) {
        return n.subtract(1);
      }
    }
  }
}

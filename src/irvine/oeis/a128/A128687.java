package irvine.oeis.a128;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A128687 Smallest odd nonprime such that every subset of a(1), ..., a(n) adds to a nonprime.
 * @author Sean A. Irvine
 */
public class A128687 extends MemorySequence {

  {
    setOffset(1);
  }

  private boolean isOk(final Z m, final int k) {
    if (m.isProbablePrime()) {
      return false;
    }
    if (k == size()) {
      return true;
    }
    return isOk(m.add(a(k)), k + 1) && isOk(m, k + 1);
  }

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      return Z.ONE;
    }
    Z m = a(size() - 1);
    do {
      m = m.add(2);
    } while (!isOk(m, 0));
    return m;
  }
}

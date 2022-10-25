package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A052349 Lexicographically earliest sequence of distinct positive integers such that no subsequence sums to a prime.
 * @author Sean A. Irvine
 */
public class A052349 extends MemorySequence {

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
      m = m.add(1);
    } while (!isOk(m, 0));
    return m;
  }
}

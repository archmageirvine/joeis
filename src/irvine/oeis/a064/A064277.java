package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A064277 Anti-divisorial 2-decomposition values.
 * @author Sean A. Irvine
 */
public class A064277 extends MemorySequence {

  /** Construct the sequence. */
  public A064277() {
    super(2);
  }

  @Override
  protected Z computeNext() {
    final int n = size() + getOffset();
    if (n < 4) {
      return Z.ONE;
    }
    Z cnt = Z.ZERO;
    for (int k = 2; k < n; ++k) {
      if (Math.abs(2 * (n % k) - k) < 2) {
        cnt = cnt.add(a(k));
      }
    }
    return cnt;
  }
}

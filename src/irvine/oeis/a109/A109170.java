package irvine.oeis.a109;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A109170 Continued fraction expansion of 2*x which equals the continued fraction of x (A109168) interleaved with positive even numbers.
 * @author Georg Fischer
 */
public class A109170 extends MemorySequence {

  /** Construct the sequence. */
  public A109170() {
    setOffset(1);
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return (n & 1) == 1 ? Z.valueOf(n + 1) : ((n % 4 == 2) ? Z.valueOf((n + 2) / 4) : a(n / 2).multiply2());
  }
}

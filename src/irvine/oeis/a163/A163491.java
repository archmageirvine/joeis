package irvine.oeis.a163;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A163491 A fractal sequence (if we delete the first occurrence of n we get the sequence itself).
 * a(n) = (n+2)/3 if n == 1 (mod 3), otherwise a(n) = a(floor(n*2/3)).
 * @author Georg Fischer
 */
public class A163491 extends MemorySequence {

  /** Construct the sequence. */
  public A163491() {
    add(Z.ZERO);
  }

  @Override
  public Z computeNext() {
    final int n = size();
    return n % 3 == 1 ? Z.valueOf((n + 2) / 3) : a((n * 2) / 3);
  }
}

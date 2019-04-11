package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A008609 <code>a(n) = n +</code> max_{0 <code>&lt;=</code> i <code>&lt;n}</code> ((n-i)*a(i)), <code>a(0) = 1</code>.
 * @author Sean A. Irvine
 */
public class A008609 extends MemorySequence {

  private static final int[] INITIAL = {1, 2, 4, 7, 12, 19, 30, 45, 68, 99, 146};

  @Override
  protected Z computeNext() {
    final int n = size();
    return n < INITIAL.length ? Z.valueOf(INITIAL[n]) : get(n - 3).multiply(3).add(n);
  }
}

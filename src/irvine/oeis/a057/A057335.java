package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.memory.MemorySequence;

/**
 * A057335 a(0) = 1, and for n &gt; 0, a(n) = A000040(A000120(n)) * a(floor(n/2)); essentially sequence A055932 generated using A000120, hence sorted by number of factors.
 * @author Sean A. Irvine
 */
public class A057335 extends MemorySequence {

  private final Sequence mA = new A057334();

  @Override
  protected Z computeNext() {
    final int n = size();
    final Z t = mA.next();
    return t.multiply(n == 0 ? Z.ONE : a(n / 2));
  }
}

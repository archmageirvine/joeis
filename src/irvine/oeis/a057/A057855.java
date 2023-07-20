package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000720;

/**
 * A057855 Greatest k such that (k-th prime) &lt;= (n times n-th prime).
 * @author Sean A. Irvine
 */
public class A057855 extends A000040 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A000720());
  private long mN = 0;

  @Override
  public Z next() {
    return mA.a(super.next().multiply(++mN).intValueExact() - 1);
  }
}

package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.a000.A000120;
import irvine.oeis.a008.A008578;

/**
 * A057334 In A000120, replace each entry k with the k-th prime and replace 0 with 1.
 * @author Sean A. Irvine
 */
public class A057334 extends A000120 {

  private final MemorySequence mP = MemorySequence.cachedSequence(new A008578());

  @Override
  public Z next() {
    return mP.a(super.next().intValueExact());
  }
}

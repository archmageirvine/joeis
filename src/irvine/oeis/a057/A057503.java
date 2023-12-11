package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.memory.MemorySequence;

/**
 * A057503 Signature-permutation of a Catalan Automorphism: Deutsch's 1998 bijection on Dyck paths.
 * @author Sean A. Irvine
 */
public class A057503 extends Sequence0 {

  private int mN = -1;
  private final MemorySequence mA057164 = MemorySequence.cachedSequence(new A057164());
  private final MemorySequence mA057162 = MemorySequence.cachedSequence(new A057162());

  @Override
  public Z next() {
    return mA057164.a(mA057162.a(mA057164.a(++mN).intValueExact()).intValueExact());
  }
}

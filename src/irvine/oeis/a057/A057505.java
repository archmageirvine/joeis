package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A057505 Signature-permutation of a Catalan Automorphism: Donaghey's map M acting on the parenthesizations encoded by A014486.
 * @author Sean A. Irvine
 */
public class A057505 extends A057163 {

  private final MemorySequence mA057164 = MemorySequence.cachedSequence(new A057164());

  @Override
  public Z next() {
    return mA057164.a(super.next().intValueExact());
  }
}

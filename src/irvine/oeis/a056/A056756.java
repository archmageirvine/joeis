package irvine.oeis.a056;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000945;

/**
 * A056756 Where n-th prime appears in Euclid-Mullin sequence A000945.
 * @author Sean A. Irvine
 */
public class A056756 extends Sequence1 {

  private final MemorySequence mEM = MemorySequence.cachedSequence(new A000945());
  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    int pos = -1;
    do {
      ++pos;
    } while (!mEM.a(pos).equals(mP));
    return Z.valueOf(pos + 1);
  }
}

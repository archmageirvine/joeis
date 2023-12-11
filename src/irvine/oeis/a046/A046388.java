package irvine.oeis.a046;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;
import irvine.oeis.memory.MemorySequence;

/**
 * A046388 Odd numbers of the form p*q where p and q are distinct primes.
 * @author Sean A. Irvine
 */
public class A046388 extends Sequence1 {

  private final MemorySequence mOddPrimes = MemorySequence.cachedSequence(new A000040().skip(1));
  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mP = mOddPrimes.next();

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mP.multiply(3)) >= 0) {
      for (int k = 0; k < mOddPrimes.size() - 1; ++k) {
        mA.add(mP.multiply(mOddPrimes.a(k)));
      }
      mP = mOddPrimes.next();
    }
    return mA.pollFirst();
  }
}

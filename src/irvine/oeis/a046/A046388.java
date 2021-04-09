package irvine.oeis.a046;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000040;

/**
 * A046388 Odd numbers of the form p*q where p and q are distinct primes.
 * @author Sean A. Irvine
 */
public class A046388 implements Sequence {

  private final MemorySequence mOddPrimes = MemorySequence.cachedSequence(new SkipSequence(new A000040(), 1));
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

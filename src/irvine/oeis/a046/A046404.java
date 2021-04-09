package irvine.oeis.a046;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a002.A002385;

/**
 * A046404 Odd numbers with exactly 2 distinct palindromic prime factors.
 * @author Sean A. Irvine
 */
public class A046404 implements Sequence {

  private final MemorySequence mOldPalinPrimes = MemorySequence.cachedSequence(new SkipSequence(new A002385(), 1));
  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mP = mOldPalinPrimes.next();

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mP.multiply2()) >= 0) {
      for (int k = 0; k < mOldPalinPrimes.size() - 1; ++k) {
        mA.add(mP.multiply(mOldPalinPrimes.a(k)));
      }
      mP = mOldPalinPrimes.next();
    }
    return mA.pollFirst();
  }
}

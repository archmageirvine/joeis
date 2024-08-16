package irvine.oeis.a046;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002385;
import irvine.oeis.memory.MemorySequence;

/**
 * A046404 Odd numbers with exactly 2 distinct palindromic prime factors.
 * @author Sean A. Irvine
 */
public class A046404 extends Sequence1 {

  private final MemorySequence mOldPalinPrimes = MemorySequence.cachedSequence(new A002385().skip(1));
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

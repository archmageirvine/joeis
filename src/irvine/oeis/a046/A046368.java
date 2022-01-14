package irvine.oeis.a046;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002385;

/**
 * A046368 Products of two palindromic primes.
 * @author Sean A. Irvine
 */
public class A046368 implements Sequence {

  private final MemorySequence mPrimePalindromes = MemorySequence.cachedSequence(new A002385());
  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mP = mPrimePalindromes.next();

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mP.multiply2()) >= 0) {
      for (int k = 0; k < mPrimePalindromes.size(); ++k) {
        mA.add(mP.multiply(mPrimePalindromes.a(k)));
      }
      mP = mPrimePalindromes.next();
    }
    return mA.pollFirst();
  }
}

package irvine.oeis.a033;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a002.A002385;

/**
 * A033620 Numbers all of whose prime factors are palindromes.
 * @author Sean A. Irvine
 */
public class A033620 extends MemorySequence {

  private final MemorySequence mPalindromePrimes = MemorySequence.cachedSequence(new A002385());
  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mPP = mPalindromePrimes.next();

  @Override
  protected Z computeNext() {
    if (isEmpty()) {
      return Z.ONE;
    }
    if (mA.isEmpty() || mA.first().compareTo(mPP) > 0) {
      for (final Z t : this) {
        mA.add(t.multiply(mPP));
      }
      mPP = mPalindromePrimes.next();
    }
    final Z res = mA.pollFirst();
    for (final Z t : mPalindromePrimes) {
      mA.add(res.multiply(t));
    }
    return res;
  }
}

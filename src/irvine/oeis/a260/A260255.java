package irvine.oeis.a260;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A260255 Numbers that can be written as the sum of two nonnegative palindromes in base 10.
 * @author Sean A. Irvine
 */
public class A260255 extends Sequence1 {

  private final MemorySequence mPalindromes = MemorySequence.cachedSequence(new A002113());
  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mNext = mPalindromes.next();

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mNext) >= 0) {
      for (int k = 0; k < mPalindromes.size(); ++k) {
        mA.add(mNext.add(mPalindromes.a(k)));
      }
      mNext = mPalindromes.next();
    }
    return mA.pollFirst();
  }
}


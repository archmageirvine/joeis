package irvine.oeis.a046;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.util.string.StringUtils;

/**
 * A046451 Semiprimes whose prime factors, when concatenated, yield a palindrome.
 * @author Sean A. Irvine
 */
public class A046451 implements Sequence {

  private final MemorySequence mPrimes = MemorySequence.cachedSequence(new A000040());
  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mP = mPrimes.next();

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mP.multiply2()) >= 0) {
      final String sp = mP.toString();
      for (int k = 0; k < mPrimes.size(); ++k) {
        if (StringUtils.isPalindrome(mPrimes.a(k) + sp)) {
          mA.add(mP.multiply(mPrimes.a(k)));
        }
      }
      mP = mPrimes.next();
    }
    return mA.pollFirst();
  }
}

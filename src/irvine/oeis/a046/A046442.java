package irvine.oeis.a046;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;

/**
 * A046442 Semiprimes whose two prime factors are distinct in length.
 * @author Sean A. Irvine
 */
public class A046442 implements Sequence {

  private final MemorySequence mPrimes = MemorySequence.cachedSequence(new A000040());
  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mP = mPrimes.next();

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mP.multiply2()) >= 0) {
      final int plen = mP.toString().length();
      for (int k = 0; k < mPrimes.size(); ++k) {
        final Z q = mPrimes.a(k);
        if (q.toString().length() != plen) {
          mA.add(mP.multiply(q));
        }
      }
      mP = mPrimes.next();
    }
    return mA.pollFirst();
  }
}

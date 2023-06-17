package irvine.oeis.a001;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000040;

/**
 * A001358 Semiprimes (or biprimes): products of two primes.
 * @author Sean A. Irvine
 */
public class A001358 extends AbstractSequence {

  /* Construct the sequence. */
  public A001358() {
    super(1);
  }

  private final MemorySequence mPrimes = MemorySequence.cachedSequence(new A000040());
  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mP = mPrimes.next();

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mP.multiply2()) >= 0) {
      for (int k = 0; k < mPrimes.size(); ++k) {
        mA.add(mP.multiply(mPrimes.a(k)));
      }
      mP = mPrimes.next();
    }
    return mA.pollFirst();
  }
}

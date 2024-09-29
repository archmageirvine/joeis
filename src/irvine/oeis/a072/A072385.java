package irvine.oeis.a072;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;

/**
 * A072385 Primes which can be represented as the sum of a prime and its reverse.
 * @author Sean A. Irvine
 */
public class A072385 extends Sequence1 {

  private final Sequence mPrimes = new A000040();
  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mP = mPrimes.next();

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mP) >= 0) {
      mP = mPrimes.next();
      final Z t = Functions.REVERSE_AND_ADD.z(mP);
      if (t.isProbablePrime()) {
        mA.add(t);
      }
    }
    return mA.pollFirst();
  }
}

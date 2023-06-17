package irvine.oeis.a003;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A003032 Smallest integer m such that the product of every 3 consecutive integers &gt; m has a prime factor &gt; prime(n).
 * @author Sean A. Irvine
 */
public class A003032 extends AbstractSequence {

  /** Construct the sequence. */
  public A003032() {
    super(2);
  }

  private final Fast mPrime = new Fast();
  private Z mP = firstPrime();
  private Z mLimit = Z.valueOf(1000);

  protected int getNumberOfConsecutivePrimes() {
    return 3;
  }

  protected Z firstPrime() {
    return Z.TWO;
  }

  private void buildSmoothToLimit(final List<Z> unsorted, final Z n, final Z maxPrime, final Z start, final Z limit) {
    for (Z k = start; k.compareTo(maxPrime) <= 0; k = mPrime.nextPrime(k)) {
      final Z t = n.multiply(k);
      if (t.compareTo(limit) <= 0) {
        unsorted.add(t);
        buildSmoothToLimit(unsorted, t, maxPrime, k, limit);
      }
    }
  }

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    final ArrayList<Z> smooth = new ArrayList<>();
    buildSmoothToLimit(smooth, Z.ONE, mP, Z.TWO, mLimit);
    Collections.sort(smooth);
    for (int k = smooth.size() - getNumberOfConsecutivePrimes(); k >= 0; --k) {
      final Z u = smooth.get(k);
      boolean ok = true;
      for (int j = 1; j < getNumberOfConsecutivePrimes(); ++j) {
        if (!u.add(j).equals(smooth.get(k + j))) {
          ok = false;
          break;
        }
      }
      if (ok) {
        mLimit = u.multiply(1000); // Hack for how far to search for next term
        return u;
      }
    }
    throw new RuntimeException();
  }
}

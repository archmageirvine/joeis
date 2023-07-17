package irvine.oeis.a000;

import java.util.ArrayList;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;

/**
 * A000928 Irregular primes: primes p such that at least one of the numerators of the Bernoulli numbers B_2, B_4, ..., B_{p-3} (A000367) is divisible by p.
 * @author Sean A. Irvine
 */
public class A000928 extends A000367 {

  /** Construct the sequence. */
  public A000928() {
    super(1);
  }

  private final ArrayList<Z> mB = new ArrayList<>();
  private final Fast mPrime = new Fast();
  private long mP = 2;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final long q = mP / 2;
      while (mB.size() < q) {
        mB.add(super.next());
      }
      for (int k = 1; k <= (mP - 3) / 2; ++k) {
        if (mB.get(k).mod(mP) == 0) {
          return Z.valueOf(mP);
        }
      }
    }
  }
}

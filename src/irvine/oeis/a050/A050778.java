package irvine.oeis.a050;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A050778 Primes that are ending primes after the iterated procedure of 'composite added to the sum of its prime factors reaches a prime'.
 * @author Sean A. Irvine
 */
public class A050778 extends A050703 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mPrev = Z.ZERO;
  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mN) >= 0) {
      mN = mN.add(1);
      if (!mN.isProbablePrime()) {
        Z t = f(mN);
        while (!t.isProbablePrime()) {
          t = f(t);
        }
        if (t.compareTo(mPrev) > 0) {
          mA.add(t);
        }
      }
    }
    mPrev = mA.pollFirst();
    return mPrev;
  }
}

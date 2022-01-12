package irvine.oeis.a053;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Permutation;

/**
 * A053008 Primes from products of split even-digit primes.
 * @author Sean A. Irvine
 */
public class A053008 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();
  private final Fast mPrime = new Fast();
  private Z mLim = Z.valueOf(100);
  private Z mUnder = Z.ONE; // Used to check leading 0 in right half
  private Z mMod = Z.TEN;
  private Z mP = Z.valueOf(11);

  protected Z select(final Z t, final Z p, final Z prod) {
    return t;
  }

  @Override
  public Z next() {
    while (true) {
      if (!mA.isEmpty()) {
        return mA.pollFirst();
      }
      mP = mPrime.nextPrime(mP);
      if (mP.compareTo(mLim) > 0) {
        // We need to jump ahead to next even length primes
        mP = mPrime.nextPrime(mLim.multiply(10));
        mLim = mLim.multiply(100);
        mUnder = mMod;
        mMod = mMod.multiply(10);
      }
      final Z[] qr = mP.divideAndRemainder(mMod);
      if (qr[1].compareTo(mUnder) >= 0) {
        final Z prod = qr[0].multiply(qr[1]);
        final Permutation permuter = Permutation.permuter(prod);
        int[] p;
        while ((p = permuter.next()) != null) {
          if (p[0] != 0) {
            final Z t = Permutation.permToZ(p);
            if (t.isProbablePrime()) {
              mA.add(select(t, mP, prod));
            }
          }
        }
      }
    }
  }
}

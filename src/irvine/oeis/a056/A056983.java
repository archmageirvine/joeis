package irvine.oeis.a056;

import java.util.ArrayList;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056983 Primes p which divide Sum_{i=1..m} i! for some m (see A125138).
 * @author Sean A. Irvine
 */
public class A056983 extends Sequence1 {

  protected final Fast mPrime = new Fast();
  private final ArrayList<Z> mFL = new ArrayList<>();
  private Z mF = Z.ONE;
  private long mN = 0;
  private long mP = 1;
  {
    mFL.add(Z.ZERO); // Sum is 0 for k < 1
  }

  protected Z get(final int k) {
    while (k >= mFL.size()) {
      mF = mF.multiply(++mN);
      mFL.add(mFL.get(mFL.size() - 1).add(mF));
    }
    return mFL.get(k);
  }

  protected Z select(final long p, final int k) {
    return Z.valueOf(p);
  }

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      for (int k = 1; k <= mP; ++k) {
        if (get(k).mod(mP) == 0) {
          return select(mP, k);
        }
      }
    }
  }
}

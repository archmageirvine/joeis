package irvine.oeis.a060;

import java.util.ArrayList;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000367;

/**
 * A060974 Irregular primes with irregularity &gt; 1.
 * @author Sean A. Irvine
 */
public class A060974 extends A000367 {

  private final ArrayList<Z> mB = new ArrayList<>();
  private final Fast mPrime = new Fast();
  private long mP = 2;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      int c = 0;
      final long q = mP / 2;
      while (mB.size() < q) {
        mB.add(super.next());
      }
      for (int k = 1; k <= (mP - 3) / 2; ++k) {
        if (mB.get(k).mod(mP) == 0 && ++c > 1) {
          return Z.valueOf(mP);
        }
      }
    }
  }
}

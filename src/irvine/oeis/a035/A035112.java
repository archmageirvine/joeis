package irvine.oeis.a035;

import java.util.ArrayList;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000367;

/**
 * A035112 Smallest even index 2a such that n-th irregular prime p (A000928(n)) divides Bernoulli_{2a} with 0&lt;=2a&lt;=p-3.
 * @author Sean A. Irvine
 */
public class A035112 extends A000367 {

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
          return Z.valueOf(2L * k);
        }
      }
    }
  }
}

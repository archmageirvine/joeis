package irvine.oeis.a387;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387174 allocated for Tamas Sandor Nagy.
 * @author Sean A. Irvine
 */
public class A387174 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final HashSet<Long> mUsed = new HashSet<>();
  private long mP = 3;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final long p2 = 2 * mP;
      long res = 0;
      for (long q = 3; 2 * q < p2; q = mPrime.nextPrime(q)) {
        if (!mUsed.contains(q) && mPrime.isPrime(p2 - q) && mUsed.add(p2 - q)) {
          //System.out.println(mP + " " + q + " " + (p2 - q));
          mUsed.add(q);
          if (res == 0) {
            res = mP;
          }
        }
      }
      if (res != 0) {
        return Z.valueOf(res);
      }
    }
  }
}


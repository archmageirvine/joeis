package irvine.oeis.a069;

import java.util.Arrays;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A069795 Prime(n) and prime(n+3) use the same digits.
 * @author Sean A. Irvine
 */
public class A069795 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  private long mQ = 5;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      mQ = mPrime.nextPrime(mQ);
      if (Arrays.equals(ZUtils.digitCounts(mP), ZUtils.digitCounts(mQ))) {
        return Z.valueOf(mP);
      }
    }
  }
}


package irvine.oeis.a069;

import java.util.Arrays;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A069796 Prime(n) and prime(n+4) use the same digits.
 * @author Sean A. Irvine
 */
public class A069796 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  private long mQ = 7;

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


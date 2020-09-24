package irvine.oeis.a035;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035032 For n &gt;= 6, max( prevprime(n), 2*prevprime(floor(n/2))).
 * @author Sean A. Irvine
 */
public class A035032 implements Sequence {

  private static final Z[] SMALL = {null, Z.ONE, Z.TWO, Z.TWO, Z.THREE, Z.THREE};
  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN < SMALL.length) {
      return SMALL[(int) mN];
    }
    return Z.valueOf(Math.max(mPrime.prevPrime(mN), 2 * mPrime.prevPrime(mN / 2)));
  }
}

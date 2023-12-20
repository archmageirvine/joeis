package irvine.oeis.a035;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A035031 For n &gt;= 7, max(A151799(n), 2*A151799(floor((n-1)/2))).
 * @author Sean A. Irvine
 */
public class A035031 extends Sequence1 {

  private static final Z[] SMALL = {null, Z.ONE, Z.TWO, Z.TWO, Z.THREE, Z.THREE};
  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN < SMALL.length) {
      return SMALL[(int) mN];
    }
    return Z.valueOf(Math.max(mPrime.prevPrime(mN), 2 * mPrime.prevPrime((mN - 1) / 2)));
  }
}

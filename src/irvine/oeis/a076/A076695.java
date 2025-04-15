package irvine.oeis.a076;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076695 Dimension of S2(G0(p)) where p runs through the odd primes &gt;= 13, G0(N) is the Hecke subgroup of SL2(Z), consisting of 2 X 2 matrices (a,b; c,d) with c == 0 (mod N).
 * @author Sean A. Irvine
 */
public class A076695 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 11;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    final long r = mP % 12;
    if (r == 1) {
      return Z.valueOf((mP - 13)/ 12);
    }
    if (r == 5) {
      return Z.valueOf((mP - 5) / 12);
    }
    if (r == 7) {
      return Z.valueOf((mP - 7)/ 12);
    }
    if (r == 11) {
      return Z.valueOf((mP + 1) / 12);
    }
    throw new RuntimeException(); // impossible
  }
}

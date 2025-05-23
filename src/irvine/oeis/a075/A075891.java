package irvine.oeis.a075;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A075891 Quotient C[p(n),{p(n)+-1}/2]/p(n), where p(n)=n-th prime.
 * @author Sean A. Irvine
 */
public class A075891 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mP = 2;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    return Functions.CATALAN.z((mP - 1) / 2);
  }
}

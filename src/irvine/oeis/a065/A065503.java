package irvine.oeis.a065;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a060.A060213;

/**
 * A065503 Let p(k) denote k-th prime; consider solutions (x,y) of Diophantine equation p(x+1)-6p(y)=1 (*), where p(x) belongs to A060213 and p(m)=(p(n)+1)/6; sequence gives values of x.
 * @author Sean A. Irvine
 */
public class A065503 extends A060213 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    final Z q = super.next();
    while (!mP.equals(q)) {
      ++mN;
      mP = mPrime.nextPrime(mP);
    }
    return Z.valueOf(mN);
  }
}

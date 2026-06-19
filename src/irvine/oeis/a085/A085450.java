package irvine.oeis.a085;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085450 a(n) is the smallest m &gt; 1 such that m divides Sum_{k=1..m} prime(k)^n.
 * @author Sean A. Irvine
 */
public class A085450 extends Sequence1 {

  private int mN = 0;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    ++mN;
    Z p = Z.TWO;
    Z sum = Z.TWO.pow(mN);
    long m = 1;
    while (true) {
      ++m;
      p = mPrime.nextPrime(p);
      sum = sum.add(p.pow(mN));
      if (sum.mod(m) == 0) {
        return Z.valueOf(m);
      }
    }
  }
}

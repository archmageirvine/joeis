package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A066889 a(n) = g(P(n)+2) - P(n), where P(n) = Product_{k=1..n} Fibonacci(k) and g(i) is the smallest prime &gt;= i.
 * @author Sean A. Irvine
 */
public class A066889 extends Sequence1 {

  private final Sequence mFibo = new A000045().skip();
  private final Fast mPrime = new Fast();
  private Z mProductF = Z.ONE;

  @Override
  public Z next() {
    mProductF = mProductF.multiply(mFibo.next());
    return mPrime.nextPrime(mProductF.add(1)).subtract(mProductF);
  }
}


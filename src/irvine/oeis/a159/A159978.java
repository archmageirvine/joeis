package irvine.oeis.a159;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A159978 a(n) = (smallest prime &gt; Fibonacci(n)) - Fibonacci(n).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A159978 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final Sequence mF = new A000045().skip();

  @Override
  public Z next() {
    final Z f = mF.next();
    return mPrime.nextPrime(f).subtract(f);
  }
}

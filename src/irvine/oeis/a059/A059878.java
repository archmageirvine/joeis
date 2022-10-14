package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a014.A014437;

/**
 * A059878 a(n) = bin_prime_sum(fibonacci(A001651[n])), where fibonacci(A001651[n]) is A014437[n].
 * @author Sean A. Irvine
 */
public class A059878 extends A059876 {

  private final Sequence mA = new A014437();
  {
    mA.next();
  }

  @Override
  public Z next() {
    return binPrimeSum(mA.next());
  }
}

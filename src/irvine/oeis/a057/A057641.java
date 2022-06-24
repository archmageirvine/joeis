package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000203;

/**
 * A057641 a(n) = floor(H(n) + exp(H(n))*log(H(n))) - sigma(n), where H(n) = Sum_{k=1..n} 1/k and sigma(n) (A000203) is the sum of the divisors of n.
 * @author Sean A. Irvine
 */
public class A057641 extends A057640 {

  private final Sequence mSigma = new A000203();

  @Override
  public Z next() {
    return super.next().subtract(mSigma.next());
  }
}

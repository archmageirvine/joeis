package irvine.oeis.a334;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.math.z.Z;
import irvine.oeis.a005.A005150;

/**
 * A334132 Smallest prime factor of n-th term in Look and Say sequence A005150, with a(1)=1.
 * @author Georg Fischer
 */
public class A334132 extends A005150 {
  @Override
  public Z next() {
    return LeastPrimeFactorizer.lpf(super.next());
  }
}

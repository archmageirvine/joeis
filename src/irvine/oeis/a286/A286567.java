package irvine.oeis.a286;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.math.z.Z;
import irvine.oeis.a001.A001045;

/**
 * A286567 Smallest prime factor of the n-th Jacobsthal number: a(n) = A020639(A001045(n)), with a(1)=a(2)=1.
 * @author Georg Fischer
 */
public class A286567 extends A001045 {

  /** Construct the sequence. */
  public A286567() {
    super(1);
    super.next();
  }

  @Override
  public Z next() {
    return LeastPrimeFactorizer.lpf(super.next());
  }
}

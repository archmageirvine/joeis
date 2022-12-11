package irvine.oeis.a127;
// manually anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a008.A008472;
import irvine.oeis.a008.A008475;

/**
 * A127268 If the prime factorization of n is n = Product_{p|n} p^b(p,n) (p = distinct prime divisors of n, each b(p,n) is a positive integer), then a(n) is (Sum_{p|n} p^b(p,n)) taken mod (Sum_{p|n} p).
 * @author Georg Fischer
 */
public class A127268 extends AbstractSequence {

  private int mN = 0;
  private A008475 mSeq1 = new A008475();
  private A008472 mSeq2 = new A008472();

  /** Construct the sequence. */
  public A127268() {
    super(1);
    mSeq1.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 1) ? Z.ZERO : mSeq1.next().mod(mSeq2.next());
  }
}

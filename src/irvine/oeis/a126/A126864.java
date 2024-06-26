package irvine.oeis.a126;
// Generated by gen_seq4.pl robot/nopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a173.A173557;

/**
 * A126864 a(n) = gcd(n, Product_{p|n} (p-1)), where the product is over the distinct primes, p, that divide n.
 * @author Georg Fischer
 */
public class A126864 extends AbstractSequence {

  private int mN;
  private final A173557 mSeq1 = new A173557();

  /** Construct the sequence. */
  public A126864() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).gcd(mSeq1.next());
  }
}

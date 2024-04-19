package irvine.oeis.a247;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000010;
import irvine.oeis.a063.A063994;

/**
 * A247074 a(n) = phi(n)/(Product_{primes p dividing n } gcd(p - 1, n - 1)).
 * @author Georg Fischer
 */
public class A247074 extends AbstractSequence {

  private int mN = 0;
  private final A000010 mSeq1 = new A000010();
  private final A063994 mSeq2 = new A063994();

  /** Construct the sequence. */
  public A247074() {
    super(1);
    mSeq2.next();
    mSeq1.next();
  }

  @Override
  public Z next() {
    return (++mN <= 1) ? Z.ONE : mSeq1.next().divide(mSeq2.next());
  }
}

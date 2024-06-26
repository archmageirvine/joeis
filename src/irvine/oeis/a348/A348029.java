package irvine.oeis.a348;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000203;
import irvine.oeis.a003.A003959;

/**
 * A348029 a(n) = A003959(n) - sigma(n), where A003959 is multiplicative with a(p^e) = (p+1)^e and sigma is the sum of divisors.
 * @author Georg Fischer
 */
public class A348029 extends AbstractSequence {

  private final A003959 mSeq1 = new A003959();
  private final A000203 mSeq2 = new A000203();

  /** Construct the sequence. */
  public A348029() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}

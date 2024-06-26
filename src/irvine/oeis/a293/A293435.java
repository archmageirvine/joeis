package irvine.oeis.a293;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a005.A005086;
import irvine.oeis.a010.A010056;

/**
 * A293435 a(n) is the number of the proper divisors of n that are Fibonacci numbers (A000045).
 * @author Georg Fischer
 */
public class A293435 extends AbstractSequence {

  private final A005086 mSeq1 = new A005086();
  private final A010056 mSeq2 = new A010056();

  /** Construct the sequence. */
  public A293435() {
    super(1);
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}

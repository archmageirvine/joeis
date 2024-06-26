package irvine.oeis.a085;
// Generated by gen_seq4.pl anopan 1, 1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000720;

/**
 * A085972 Number of numbers &lt;= n that are primes or not prime powers.
 * @author Georg Fischer
 */
public class A085972 extends AbstractSequence {

  private final A085970 mSeq1 = new A085970();
  private final A000720 mSeq2 = new A000720();

  /** Construct the sequence. */
  public A085972() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().add(mSeq2.next());
  }
}

package irvine.oeis.a363;
// Generated by gen_seq4.pl anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000005;
import irvine.oeis.a057.A057567;

/**
 * A363756 Total number of distinct ways the divisors of n can be the product of other nontrivial divisors of n.
 * @author Georg Fischer
 */
public class A363756 extends AbstractSequence {

  private final A057567 mSeq1 = new A057567();
  private final A000005 mSeq2 = new A000005();

  /** Construct the sequence. */
  public A363756() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}

package irvine.oeis.a306;
// Generated by gen_seq4.pl anopan 1, 1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a007.A007955;
import irvine.oeis.a211.A211776;

/**
 * A306705 a(n) = Product_{d|n} d*tau(d), where tau(k) = the number of the divisors of k (A000005).
 * @author Georg Fischer
 */
public class A306705 extends AbstractSequence {

  private final A211776 mSeq1 = new A211776();
  private final A007955 mSeq2 = new A007955();

  /** Construct the sequence. */
  public A306705() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(mSeq2.next());
  }
}

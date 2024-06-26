package irvine.oeis.a137;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000005;
import irvine.oeis.a129.A129308;

/**
 * A137921 Number of divisors d of n such that d+1 is not a divisor of n.
 * @author Georg Fischer
 */
public class A137921 extends AbstractSequence {

  private final A000005 mSeq1 = new A000005();
  private final A129308 mSeq2 = new A129308();

  /** Construct the sequence. */
  public A137921() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}

package irvine.oeis.a161;
// Generated by gen_seq4.pl anopan 1, 1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000027;
import irvine.oeis.a002.A002808;

/**
 * A161537 a(n) = n-th composite + n.
 * @author Georg Fischer
 */
public class A161537 extends AbstractSequence {

  private final A002808 mSeq1 = new A002808();
  private final A000027 mSeq2 = new A000027();

  /** Construct the sequence. */
  public A161537() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().add(mSeq2.next());
  }
}

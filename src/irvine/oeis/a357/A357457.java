package irvine.oeis.a357;
// manually anopan 0, 0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000035;
import irvine.oeis.a000.A000700;

/**
 * A357457 Number of partitions of n into two or more distinct odd parts.
 * @author Georg Fischer
 */
public class A357457 extends AbstractSequence {

  private int mN = -1;
  private A000700 mSeq1 = new A000700();
  private A000035 mSeq2 = new A000035();

  /** Construct the sequence. */
  public A357457() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = mSeq1.next().subtract(mSeq2.next());
    return (mN == 0) ? Z.ZERO : result;
  }
}

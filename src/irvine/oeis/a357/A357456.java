package irvine.oeis.a357;
// manually anopan 0, 0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000009;
import irvine.oeis.a000.A000035;

/**
 * A357456 Number of partitions of n into two or more odd parts.
 * @author Georg Fischer
 */
public class A357456 extends AbstractSequence {

  private int mN = -1;
  private A000009 mSeq1 = new A000009();
  private A000035 mSeq2 = new A000035();

  /** Construct the sequence. */
  public A357456() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = mSeq1.next().subtract(mSeq2.next());
    return (mN == 0) ? Z.ZERO : result;
  }
}

package irvine.oeis.a242;
// manually anopan 0,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000041;
import irvine.oeis.a000.A000700;

/**
 * A242101 Number of conjugacy classes of the symmetric group S_n when conjugating only by even permutations.
 * @author Georg Fischer
 */
public class A242101 extends AbstractSequence {

  private int mN = 0;
  private A000041 mSeq1 = new A000041();
  private A000700 mSeq2 = new A000700();

  /** Construct the sequence. */
  public A242101() {
    super(1);
    mSeq1.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    final Z result = mSeq1.next().add(mSeq2.next());
    return (++mN == 1) ? Z.ONE : result;
  }
}

package irvine.oeis.a356;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a011.A011782;
import irvine.oeis.a107.A107428;

/**
 * A356846 Number of integer compositions of n into parts not covering an interval of positive integers.
 * @author Georg Fischer
 */
public class A356846 extends AbstractSequence {

  private int mN = -1;
  private A011782 mSeq1 = new A011782();
  private A107428 mSeq2 = new A107428();

  /** Construct the sequence. */
  public A356846() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return mSeq1.next().subtract((mN == 0) ? Z.ONE : mSeq2.next());
  }
}

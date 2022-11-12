package irvine.oeis.a200;
// manually hologf4/hologfe at 2022-11-10 10:21

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001865;

/**
 * A200248 The number of (simultaneously) fixed and isolated points in the digraph representation of all functions f:{1,2,...,n}-&gt;{1,2,...,n}.
 * @author Georg Fischer
 */
public class A200248 extends AbstractSequence {

  private int mN = -1;
  private final Sequence mSeq = new A001865();

  /** Construct the sequence. */
  public A200248() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    if (mN <= 1) {
      return Z.valueOf(mN);
    }
    return mSeq.next().multiply(mN);
  }
}

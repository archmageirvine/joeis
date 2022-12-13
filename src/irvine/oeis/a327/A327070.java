package irvine.oeis.a327;
// manually anopan 0,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001187;
import irvine.oeis.a006.A006129;

/**
 * A327070 Number of non-connected simple labeled graphs covering n vertices.
 * @author Georg Fischer
 */
public class A327070 extends AbstractSequence {

  private int mN = -1;
  private static final Z[] INITS = {Z.ONE, Z.ZERO};
  private final A006129 mSeq1 = new A006129();
  private final A001187 mSeq2 = new A001187();

  /** Construct the sequence. */
  public A327070() {
    super(0);
  }

  @Override
  public Z next() {
    final Z result = mSeq1.next().subtract(mSeq2.next());
    return ++mN < 2 ? INITS[mN] : result;
  }
}

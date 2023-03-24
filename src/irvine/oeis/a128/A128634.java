package irvine.oeis.a128;
// manually simple3 at 2023-03-23 22:27

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001453;

/**
 * A128634 Number of parallel permutations of length n.
 * @author Georg Fischer
 */
public class A128634 extends AbstractSequence {

  private int mN = 0;
  private final A001453 mSeq = new A001453();

  /** Construct the sequence. */
  public A128634() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 1) ? Z.ZERO : Z.TWO.multiply(mSeq.next());
  }
}

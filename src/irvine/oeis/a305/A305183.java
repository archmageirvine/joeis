package irvine.oeis.a305;
// manually simple3 at 2023-03-23 22:27

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a005.A005179;

/**
 * A305183 Least k such that A048272(k) = -n.
 * @author Georg Fischer
 */
public class A305183 extends AbstractSequence {

  private int mN = -1;
  private final A005179 mSeq = new A005179();

  /** Construct the sequence. */
  public A305183() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.TWO : Z.FOUR.multiply(mSeq.next());
  }
}

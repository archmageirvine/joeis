package irvine.oeis.a206;
// manually simple3 at 2023-03-23 22:27

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a053.A053506;

/**
 * A206855 The sum of the degree of each root node over all rooted labeled trees on n nodes.
 * @author Georg Fischer
 */
public class A206855 extends AbstractSequence {

  private int mN = -1;
  private final A053506 mSeq = new A053506();

  /** Construct the sequence. */
  public A206855() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ZERO : Z.TWO.multiply(mSeq.next());
  }
}

package irvine.oeis.a158;
// manually simple3 at 2023-03-23 22:27

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a058.A058498;

/**
 * A158380 Number of solutions to +-1 +- 3 +- 6 +- ... +- n(n+1)/2 = 0.
 * @author Georg Fischer
 */
public class A158380 extends AbstractSequence {

  private int mN = -1;
  private final A058498 mSeq = new A058498();

  /** Construct the sequence. */
  public A158380() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ONE : Z.TWO.multiply(mSeq.next());
  }
}

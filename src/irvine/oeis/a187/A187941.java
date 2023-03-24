package irvine.oeis.a187;
// manually simple3 at 2023-03-23 22:27

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a005.A005179;

/**
 * A187941 Least number with exactly n even divisors.
 * @author Georg Fischer
 */
public class A187941 extends AbstractSequence {

  private int mN = -1;
  private final A005179 mSeq = new A005179();

  /** Construct the sequence. */
  public A187941() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ONE : Z.TWO.multiply(mSeq.next());
  }
}

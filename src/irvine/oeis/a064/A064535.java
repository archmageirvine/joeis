package irvine.oeis.a064;
// manually simple3 at 2023-03-23 22:27

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a007.A007663;

/**
 * A064535 a(n) = (2^prime(n)-2)/prime(n); a(0) = 0 by convention.
 * @author Georg Fischer
 */
public class A064535 extends AbstractSequence {

  private int mN = -1;
  private final A007663 mSeq = new A007663();

  /** Construct the sequence. */
  public A064535() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN <= 1) ? Z.valueOf(mN) : Z.TWO.multiply(mSeq.next());
  }
}

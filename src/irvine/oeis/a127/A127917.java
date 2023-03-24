package irvine.oeis.a127;
// manually simple3 at 2023-03-23 22:27

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a117.A117762;

/**
 * A127917 Product of three numbers: n-th prime, previous number, and following number.
 * @author Georg Fischer
 */
public class A127917 extends AbstractSequence {

  private int mN = 0;
  private final A117762 mSeq = new A117762();

  /** Construct the sequence. */
  public A127917() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return ((mN == 1) ? Z.ONE : Z.TWO).multiply(mSeq.next());
  }
}

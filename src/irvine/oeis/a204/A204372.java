package irvine.oeis.a204;
// manually simple3 at 2023-03-23 22:27

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a050.A050456;

/**
 * A204372 Expansion of phi(x)^2 * (5 * phi(-x)^8 + 64 * x * psi(-x)^8) in powers of x where phi(), psi() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A204372 extends AbstractSequence {

  private int mN = -1;
  private final A050456 mSeq = new A050456();

  /** Construct the sequence. */
  public A204372() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.FIVE : Z.FOUR.multiply(mSeq.next());
  }
}

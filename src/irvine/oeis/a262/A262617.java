package irvine.oeis.a262;
// manually simple3 at 2023-03-23 22:27

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a080.A080079;

/**
 * A262617 First differences of A256266.
 * @author Georg Fischer
 */
public class A262617 extends AbstractSequence {

  private int mN = -1;
  private final A080079 mSeq = new A080079();

  /** Construct the sequence. */
  public A262617() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ZERO : Z.SIX.multiply(mSeq.next());
  }
}

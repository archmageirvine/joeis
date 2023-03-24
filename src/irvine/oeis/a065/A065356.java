package irvine.oeis.a065;
// manually simple3 at 2023-03-23 22:27

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a025.A025016;

/**
 * A065356 Final digits of A065355(n) (in reverse order) for sufficiently large n.
 * @author Georg Fischer
 */
public class A065356 extends AbstractSequence {

  private int mN = -1;
  private final A025016 mSeq = new A025016();

  /** Construct the sequence. */
  public A065356() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return ((mN == 0) ? Z.TEN : Z.NINE).subtract(mSeq.next());
  }
}

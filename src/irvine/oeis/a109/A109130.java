package irvine.oeis.a109;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a027.A027441;

/**
 * A109130 Magic constant of smallest order-n perfect magic cube.
 * @author Georg Fischer
 */
public class A109130 extends Sequence1 {

  private int mN = 0;
  private final Sequence mSeq = new A027441();

  {
    mSeq.next();
  }

  /** Construct the sequence. */
  public Z next() {
    ++mN;
    final Z result = mSeq.next();
    return (mN >= 2 && mN <= 4) ? Z.ZERO : result;
  }
}

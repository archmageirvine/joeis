package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a036.A036566;

/**
 * A025731 Index of 8^n within the sequence of the numbers of the form 7^i*8^j.
 * @author Sean A. Irvine
 */
public class A025731 extends AbstractSequence {

  private long mN = 0;
  private Z mA = Z.ONE;

  private final A036566 mSeq = new A036566();

  /** Construct the sequence. */
  public A025731() {
    super(0);
  }

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!mA.equals(mSeq.next()));
    mA = mA.shiftLeft(3);
    return Z.valueOf(mN);
  }
}

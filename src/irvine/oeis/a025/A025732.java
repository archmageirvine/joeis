package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A025732 Index of 8^n within the sequence of the numbers of the form 8^i*9^j.
 * @author Sean A. Irvine
 */
public class A025732 extends AbstractSequence {

  private long mN = 0;
  private Z mA = Z.ONE;

  private final A025633 mSeq = new A025633();

  /** Construct the sequence. */
  public A025732() {
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

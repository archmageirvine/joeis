package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A025728 Index of 8^n within the sequence of the numbers of the form 3^i*8^j (A025615).
 * @author Sean A. Irvine
 */
public class A025728 extends AbstractSequence {

  private long mN = 0;
  private Z mA = Z.ONE;

  private final A025615 mSeq = new A025615();

  /** Construct the sequence. */
  public A025728() {
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

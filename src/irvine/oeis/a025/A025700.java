package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A025700 Index of 3^n within sequence of numbers of form 3^i * 10^j.
 * @author Sean A. Irvine
 */
public class A025700 extends AbstractSequence {

  private final A025616 mSeq1 = new A025616();

  /** Construct the sequence. */
  public A025700() {
    super(0);
  }

  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!mA.equals(mSeq1.next()));
    mA = mA.multiply(3);
    return Z.valueOf(mN);
  }
}

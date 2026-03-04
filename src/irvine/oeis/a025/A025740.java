package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A025740 Index of 10^n within the sequence of the numbers of the form 2^i*10^j.
 * @author Sean A. Irvine
 */
public class A025740 extends AbstractSequence {

  private long mN = 0;
  private Z mA = Z.ONE;

  private final A025612 mSeq = new A025612();

  /** Construct the sequence. */
  public A025740() {
    super(0);
  }

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!mA.equals(mSeq.next()));
    mA = mA.multiply(10);
    return Z.valueOf(mN);
  }
}

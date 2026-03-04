package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A025733 Index of 8^n within the sequence of the numbers of the form 8^i*10^j.
 * @author Sean A. Irvine
 */
public class A025733 extends AbstractSequence {

  private long mN = 0;
  private Z mA = Z.ONE;

  private final A025634 mSeq = new A025634();

  /** Construct the sequence. */
  public A025733() {
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

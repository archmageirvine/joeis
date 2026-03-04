package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A025722 Index of 7^n within the sequence of the numbers of the form 4^i*7^j.
 * @author Sean A. Irvine
 */
public class A025722 extends AbstractSequence {

  private long mN = 0;
  private Z mA = Z.ONE;

  private final A025619 mSeq = new A025619();

  /** Construct the sequence. */
  public A025722() {
    super(0);
  }

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!mA.equals(mSeq.next()));
    mA = mA.multiply(7);
    return Z.valueOf(mN);
  }
}

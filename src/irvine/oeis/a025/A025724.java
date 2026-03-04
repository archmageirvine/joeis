package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A025724 Index of 7^n within the sequence of the numbers of the form 6^i*7^j.
 * @author Sean A. Irvine
 */
public class A025724 extends AbstractSequence {

  private long mN = 0;
  private Z mA = Z.ONE;

  private final A025626 mSeq = new A025626();

  /** Construct the sequence. */
  public A025724() {
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

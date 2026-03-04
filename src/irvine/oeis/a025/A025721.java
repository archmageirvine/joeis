package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a003.A003594;

/**
 * A025721 Index of 7^n within the sequence of the numbers of the form 3^i*7^j.
 * @author Sean A. Irvine
 */
public class A025721 extends AbstractSequence {

  private long mN = 0;
  private Z mA = Z.ONE;

  private final A003594 mSeq = new A003594();

  /** Construct the sequence. */
  public A025721() {
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

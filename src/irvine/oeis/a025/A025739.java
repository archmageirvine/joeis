package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A025739 Index of 9^n within the sequence of the numbers of the form 9^i*10^j.
 * @author Sean A. Irvine
 */
public class A025739 extends AbstractSequence {

  private long mN = 0;
  private Z mA = Z.ONE;

  private final A025635 mSeq = new A025635();

  /** Construct the sequence. */
  public A025739() {
    super(0);
  }

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!mA.equals(mSeq.next()));
    mA = mA.multiply(9);
    return Z.valueOf(mN);
  }
}

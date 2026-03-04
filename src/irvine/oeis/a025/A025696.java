package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A025696 Index of 3^n within the sequence of the numbers of the form 3^i*4^j.
 * @author Sean A. Irvine
 */
public class A025696 extends AbstractSequence {

  private long mN = 0;
  private Z mA = Z.ONE;

  private final A025613 mSeq = new A025613();

  /** Construct the sequence. */
  public A025696() {
    super(0);
  }

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!mA.equals(mSeq.next()));
    mA = mA.multiply(3);
    return Z.valueOf(mN);
  }
}

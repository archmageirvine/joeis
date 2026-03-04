package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A025697 Index of 3^n within the sequence of the numbers of the form 3^i*6^j.
 * @author Sean A. Irvine
 */
public class A025697 extends AbstractSequence {

  private long mN = 0;
  private Z mA = Z.ONE;

  private final A025614 mSeq = new A025614();

  /** Construct the sequence. */
  public A025697() {
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

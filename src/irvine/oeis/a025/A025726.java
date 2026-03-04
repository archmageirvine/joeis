package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A025726 Index of 7^n within the sequence of the numbers of the form 7^i*9^j.
 * @author Sean A. Irvine
 */
public class A025726 extends AbstractSequence {

  private long mN = 0;
  private Z mA = Z.ONE;

  private final A025631 mSeq = new A025631();

  /** Construct the sequence. */
  public A025726() {
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

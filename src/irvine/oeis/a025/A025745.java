package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A025745 Index of 10^n within the sequence of the numbers of the form 7^i*10^j.
 * @author Sean A. Irvine
 */
public class A025745 extends AbstractSequence {

  private long mN = 0;
  private Z mA = Z.ONE;

  private final A025632 mSeq = new A025632();

  /** Construct the sequence. */
  public A025745() {
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

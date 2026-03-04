package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A025718 Index of 6^n within the sequence of the numbers of the form 6^i*9^j.
 * @author Sean A. Irvine
 */
public class A025718 extends AbstractSequence {

  private long mN = 0;
  private Z mA = Z.ONE;

  private final A025628 mSeq = new A025628();

  /** Construct the sequence. */
  public A025718() {
    super(0);
  }

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!mA.equals(mSeq.next()));
    mA = mA.multiply(6);
    return Z.valueOf(mN);
  }
}

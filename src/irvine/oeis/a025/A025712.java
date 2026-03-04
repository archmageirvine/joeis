package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A025712 Index of 6^n within the sequence of the numbers of the form 2^i*6^j.
 * @author Sean A. Irvine
 */
public class A025712 extends AbstractSequence {

  private long mN = 0;
  private Z mA = Z.ONE;

  private final A025610 mSeq = new A025610();

  /** Construct the sequence. */
  public A025712() {
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

package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A025710 Index of 5^n within the sequence of the numbers of the form 5^i*9^j.
 * @author Sean A. Irvine
 */
public class A025710 extends AbstractSequence {

  private long mN = 0;
  private Z mA = Z.ONE;

  private final A025624 mSeq = new A025624();

  /** Construct the sequence. */
  public A025710() {
    super(0);
  }

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!mA.equals(mSeq.next()));
    mA = mA.multiply(5);
    return Z.valueOf(mN);
  }
}

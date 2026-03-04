package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A025711 Index of 5^n within the sequence of the numbers of the form 5^i*10^j.
 * @author Sean A. Irvine
 */
public class A025711 extends AbstractSequence {

  private long mN = 0;
  private Z mA = Z.ONE;

  private final A025625 mSeq = new A025625();

  /** Construct the sequence. */
  public A025711() {
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

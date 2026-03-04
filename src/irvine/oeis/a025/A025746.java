package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A025746 Index of 10^n within the sequence of the numbers of the form 8^i*10^j.
 * @author Sean A. Irvine
 */
public class A025746 extends Sequence0 {

  private long mN = 0;
  private Z mA = Z.ONE;

  private final A025634 mSeq = new A025634();

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!mA.equals(mSeq.next()));
    mA = mA.multiply(10);
    return Z.valueOf(mN);
  }
}

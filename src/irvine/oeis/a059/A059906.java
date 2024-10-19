package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A059906 Index of second half of decomposition of integers into pairs based on A000695.
 * @author Sean A. Irvine
 */
public class A059906 extends Sequence0 implements DirectSequence {

  private final DirectSequence mA = new A059905();
  private long mN = -1;

  @Override
  public Z next() {
    return mA.a(Z.valueOf(++mN >>> 1));
  }

  @Override
  public Z a(final Z n) {
    return mA.a(n.divide2());
  }

  @Override
  public Z a(final int n) {
    return mA.a(n / 2);
  }
}

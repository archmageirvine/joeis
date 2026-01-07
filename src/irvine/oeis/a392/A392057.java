package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A392057 a(0)=0, a(n) = wt(a(n-1)) + wt(n), where wt(x) is the binary weight of x, A000120.
 * @author Sean A. Irvine
 */
public class A392057 extends Sequence0 {

  private long mN = -1;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    mA = Z.valueOf(mA.bitCount() + Long.bitCount(++mN));
    return mA;
  }
}

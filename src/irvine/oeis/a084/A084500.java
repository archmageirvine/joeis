package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;

/**
 * A084500 a(0)=0, after which each n occurs A084506(n) times.
 * @author Sean A. Irvine
 */
public class A084500 extends Sequence0 {

  private final Sequence mA = new A084506();
  private Z mN = Z.ZERO;
  private long mM = 2;

  @Override
  public Z next() {
    if (--mM <= 0) {
      mM = mA.next().longValueExact();
      mN = mN.add(1);
    }
    return mN;
  }
}

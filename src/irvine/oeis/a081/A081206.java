package irvine.oeis.a081;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a046.A046854;

/**
 * A081206 Correlation matrix of triangle A046854.
 * @author Sean A. Irvine
 */
public class A081206 extends Sequence0 {

  private final A046854 mA = new A046854();
  private int mN = 0;
  private int mM = -1;

  private Z t(final int n, final int m) {
    return Integers.SINGLETON.sum(0, Math.min(n, m), k -> mA.a(n, k).multiply(mA.a(m, k)));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM, mN - mM);
  }
}

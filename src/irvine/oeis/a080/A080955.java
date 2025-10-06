package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A080910.
 * @author Sean A. Irvine
 */
public class A080955 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;

  private Z t(final int n, final int m) {
    return Integers.SINGLETON.sum(0, m, k -> Functions.FACTORIAL.z(m).divide(Functions.FACTORIAL.z(k)).multiply(Z.valueOf(n).pow(k)));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM);
  }
}


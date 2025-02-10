package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A074598.
 * @author Sean A. Irvine
 */
public class A075148 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  private Z t(final int n, final int k) {
    return (n & 1) == 0 ? Functions.FIBONACCI.z(n + k) : Functions.LUCAS.z(n + k);
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

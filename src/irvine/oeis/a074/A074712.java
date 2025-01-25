package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074696.
 * @author Sean A. Irvine
 */
public class A074712 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  private Z t(final long n, final long m) {
    return Z.valueOf(n + m - Functions.GCD.l(n, m));
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return t(mM + 1, mN - mM);
  }
}

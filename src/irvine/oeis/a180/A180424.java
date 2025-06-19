package irvine.oeis.a180;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a119.A119963;

/**
 * A180424 "ARE(n,k)" triangle read by rows. ARE(n,k) is the number of aperiodic k-reverses of n up to cyclic equivalence.
 * @author Sean A. Irvine
 */
public class A180424 extends Sequence1 {

  private final A119963 mRE = new A119963();
  private long mN = 0;
  private long mM = 0;

  protected Z t(final long n, final long m) {
    return Integers.SINGLETON.sumdiv(Functions.GCD.i(n, m), d -> mRE.t(n / d, m / d).multiply(Functions.MOBIUS.i(d)));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}

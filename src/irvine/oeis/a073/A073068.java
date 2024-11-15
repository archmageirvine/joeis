package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073068 Minimum value of abs(n-x*tau(x)) x&gt;0.
 * @author Sean A. Irvine
 */
public class A073068 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long min = mN;
    for (long k = 1; k <= mN; ++k) {
      min = Math.min(min, Math.abs(mN - Functions.SIGMA0.l(k) * k));
    }
    return Z.valueOf(min);
  }
}

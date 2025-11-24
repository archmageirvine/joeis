package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082048 a(n) = least number greater than n having greater smallest prime factor than that of n.
 * @author Sean A. Irvine
 */
public class A082048 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long lpf = Functions.LPF.l(++mN);
    long k = mN;
    while (true) {
      if (Functions.LPF.l(++k) > lpf) {
        return Z.valueOf(k);
      }
    }
  }
}

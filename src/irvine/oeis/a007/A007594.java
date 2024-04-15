package irvine.oeis.a007;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007594 Smallest n-hyperperfect number: m such that m=n(sigma(m)-m-1)+1; or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A007594 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long m = 1;
    while (true) {
      final long sigma = Functions.SIGMA.l(++m);
      final long s = sigma - m - 1;
      if (mN * s == m - 1) {
        return Z.valueOf(m);
      }
    }
  }
}

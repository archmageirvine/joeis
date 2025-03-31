package irvine.oeis.a076;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076302 Triangle T(n,k) = number of k-smooth divisors of n, read by rows.
 * @author Sean A. Irvine
 */
public class A076302 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    long cnt = 0;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      if (Functions.GPF.l(d) <= mM) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

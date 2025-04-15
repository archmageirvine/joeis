package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076711 Highly composite triangular numbers: triangular numbers where the number of divisors increases to a record.
 * @author Sean A. Irvine
 */
public class A076711 extends Sequence1 {

  private Z mBest = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = Functions.TRIANGULAR.z(++mN);
      final Z s = Functions.SIGMA0.z(t);
      if (s.compareTo(mBest) > 0) {
        mBest = s;
        return t;
      }
    }
  }
}

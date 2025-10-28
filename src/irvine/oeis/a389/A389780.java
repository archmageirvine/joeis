package irvine.oeis.a389;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389780 allocated for Juri-Stepan Gerasimov.
 * @author Sean A. Irvine
 */
public class A389780 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    final Z n = Z.valueOf(++mN);
    for (final Z d : Jaguar.factor(n).divisors()) {
      final Z nd = n.divide(d);
      if (Functions.GCD.l(d.square().subtract(1), mN) == 1 && Functions.GCD.l(nd.square().subtract(1), mN) != 1) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}


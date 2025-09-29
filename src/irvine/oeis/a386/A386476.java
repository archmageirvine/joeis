package irvine.oeis.a386;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A386476 allocated for Juri-Stepan Gerasimov.
 * @author Sean A. Irvine
 */
public class A386476 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      if (Functions.GCD.z(d.square().subtract(1), mN).isOne()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393102 Numbers k whose smallest prime factor index is equal to the number of distinct prime factors of k and whose largest prime factor index is equal to the number of prime factors of k counted with multiplicity.
 * @author Sean A. Irvine
 */
public class A393102 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.PRIME_PI.l(Functions.LPF.l(++mN)) == Functions.OMEGA.l(mN)
        && Functions.PRIME_PI.l(Functions.GPF.l(mN)) == Functions.BIG_OMEGA.l(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

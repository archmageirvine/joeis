package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395415 a(n) is the smallest n-simplex number that has exactly n prime factors, counted with multiplicity.
 * @author Sean A. Irvine
 */
public class A395415 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = -1;
    while (true) {
      final Z t = Binomial.binomial(mN + ++k, mN);
      if (Functions.BIG_OMEGA.l(t) == mN) {
        return t;
      }
    }
  }
}


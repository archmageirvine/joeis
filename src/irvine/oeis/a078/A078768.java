package irvine.oeis.a078;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078768 a(n) is the number of iterations of k -&gt; sigma(k) + 1 needed to reach a prime, or 0 if no prime is reached.
 * @author Sean A. Irvine
 */
public class A078768 extends Sequence1 {

  private long mN = 0;

  private Z f(final Z n) {
    return Functions.SIGMA1.z(n).add(1);
  }

  @Override
  public Z next() {
    Z m = Z.valueOf(++mN);
    final HashSet<Z> seen = new HashSet<>();
    long cnt = 0;
    do {
      if (!seen.add(m)) {
        return Z.ZERO;
      }
      if (m.isEven() && Predicates.POWER_OF_TWO.is(m)) {
        return Z.ZERO;
      }
      m = f(m);
      ++cnt;
    } while (!m.isProbablePrime());
    return Z.valueOf(cnt);
  }
}


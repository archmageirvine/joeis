package irvine.oeis.a384;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A384994 Positive numbers whose prime indices of their prime factors, together with their exponents are distinct.
 * @author Sean A. Irvine
 */
public class A384994 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    final HashSet<Integer> seen = new HashSet<>();
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      if (!seen.add(e) || n % Functions.PRIME.l(e) == 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

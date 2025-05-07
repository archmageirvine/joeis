package irvine.oeis.a077;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077090 When iteration of f(x) = phi(sigma(x) - phi(x)) is started at initial values listed here it ends up in a cycle of length greater than 1.
 * @author Sean A. Irvine
 */
public class A077090 extends Sequence1 {

  private long mN = 35;

  private Z f(final Z n) {
    return Functions.PHI.z(Functions.SIGMA1.z(n).subtract(Functions.PHI.z(n)));
  }

  @Override
  public Z next() {
    while (true) {
      final HashSet<Z> seen = new HashSet<>();
      Z t = Z.valueOf(++mN);
      seen.add(t);
      while (seen.add(t = f(t))) {
        // do nothing
      }
      if (!t.isOne() && !f(t).equals(t)) {
        return Z.valueOf(mN);
      }
    }
  }
}


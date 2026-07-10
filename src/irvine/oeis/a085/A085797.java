package irvine.oeis.a085;

import irvine.factor.factor.Jaguar;
import irvine.math.api.Set;
import irvine.math.group.IntegersModMul;
import irvine.math.set.FiniteSet;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A085794.
 * @author Sean A. Irvine
 */
public class A085797 extends FilterNumberSequence {

  private static final FiniteSet<Z> S = new FiniteSet<>(Z.SIX, Z.valueOf(16));

  /** Construct the sequence. */
  public A085797() {
    super(1, k -> {
      final long m = 8L * k + 1;
      if (m % 3 == 0) {
        if (m % 9 != 0 || m % 27 == 0) {
          return false;
        }
      }
      for (final Z p : Jaguar.factor(m).toZArray()) {
        if (!p.equals(Z.THREE)) {
          final Set<Z> s = new IntegersModMul(p).generateSubgroup(S);
          if (s.contains(Z.FOUR) || s.contains(p.subtract(4))) {
            return false;
          }
        }
      }
      return true;
    });
  }
}

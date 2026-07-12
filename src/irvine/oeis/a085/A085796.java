package irvine.oeis.a085;

import irvine.factor.factor.Jaguar;
import irvine.math.api.Set;
import irvine.math.group.IntegersModMul;
import irvine.math.set.FiniteSet;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A085796 Dimensions k such that the (3,k)-cross lattice-tiles R^k.
 * @author Sean A. Irvine
 */
public class A085796 extends FilterNumberSequence {

  private static final FiniteSet<Z> S = new FiniteSet<>(Z.SIX, Z.EIGHT);

  /** Construct the sequence. */
  public A085796() {
    super(1, k -> {
      for (final Z p : Jaguar.factor(6L * k + 1).toZArray()) {
        final Set<Z> s = new IntegersModMul(p).generateSubgroup(S);
        if (s.contains(Z.TWO) || s.contains(p.subtract(2))) {
          return false;
        }
      }
      return true;
    });
  }
}

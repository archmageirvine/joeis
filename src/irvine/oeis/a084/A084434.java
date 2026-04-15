package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;
import irvine.util.Permutation;

/**
 * A084434 Numbers whose digit permutations have GCD &gt; 1.
 * @author Sean A. Irvine
 */
public class A084434 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A084434() {
    super(1, k -> {
      long gcd = k;
      final Permutation perm = Permutation.permuter(Z.valueOf(k));
      int[] p;
      while ((p = perm.next()) != null && gcd > 1) {
        gcd = Functions.GCD.l(gcd, Permutation.permToZ(p));
      }
      return gcd > 1;
    });
  }
}

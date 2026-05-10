package irvine.oeis.a394;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A394951 Number of equivalence classes of well-formed bracketed words of total length 2n built from the symbol * (of length 2) and two unary bracket types () and [], with no empty bracket pair, modulo commutativity of concatenation, where every maximal chain of unary brackets is written in canonical weakly increasing order.
 * @author Sean A. Irvine
 */
public class A394951 extends A394948 {

  @Override
  protected Z b(final long n) {
    return n == 1 ? Z.ONE : Integers.SINGLETON.sum(1, Math.min(2, n - 1), j -> Z.NEG_ONE.pow(j + 1).multiply(Binomial.binomial(2, j)).multiply(a(n - j)));
  }
}

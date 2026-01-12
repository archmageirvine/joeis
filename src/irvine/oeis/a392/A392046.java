package irvine.oeis.a392;

import java.util.Collection;
import java.util.TreeSet;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.util.Permutation;

/**
 * A392046 Even positive integers whose canonical prime factorization p_1^e_1*...*p_r^e_r satisfies that {p_1, ..., p_r, e_1, ..., e_r} is a set of 2*r consecutive integers.
 * @author Sean A. Irvine
 */
public class A392046 extends FiniteSequence {

  private static boolean isOk(final int[] p) {
    for (int j = 1; j < p.length; j += 2) {
      if (!Predicates.PRIME.is(p[j])) {
        return false;
      }
      if (j > 1 && p[j] < p[j - 2]) {
        return false;
      }
    }
    return true;
  }

  private static void build(final Collection<Z> res, final int... seed) {
    final Permutation perm = new Permutation(seed);
    int[] p;
    while ((p = perm.next()) != null) {
      if (isOk(p)) {
        Z prod = Z.TWO.pow(p[0]);
        for (int j = 1; j < p.length; j += 2) {
          prod = prod.multiply(Z.valueOf(p[j]).pow(p[j + 1]));
        }
        res.add(prod);
      }
    }
  }

  private static Collection<Z> build() {
    final TreeSet<Z> res = new TreeSet<>();
    // Implicit 2 in all allowed combinations
    build(res, 1);
    build(res, 1, 3, 4);
    build(res, 1, 3, 4);
    build(res, 1, 3, 4, 5, 6);
    build(res, 1, 3, 4, 5, 6, 7, 8);
    build(res, 3);
    build(res, 3, 4, 5);
    build(res, 3, 4, 5);
    build(res, 3, 4, 5, 6, 7);
    build(res, 3, 4, 5, 6, 7, 8, 9);
    build(res, 3, 4, 5, 6, 7, 8, 9, 10, 11);
    build(res, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
    return res;
  }

  /** Construct the sequence. */
  public A392046() {
    super(1, FINITE, build());
  }
}


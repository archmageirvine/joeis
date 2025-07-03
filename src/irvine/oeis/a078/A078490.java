package irvine.oeis.a078;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A078490 Sorted A079341.
 * @author Sean A. Irvine
 */
public class A078490 extends FiniteSequence {

  private static List<Z> build() {
    final PolynomialRing<Z> ring = new PolynomialRing<>(Integers.SINGLETON);
    final Polynomial<Z> p = ring.pow(ring.oneMinusXToTheN(1), 24, 12);
    final List<Z> res = new ArrayList<>();
    for (int k = 0; k <= p.degree(); ++k) {
      for (int j = k; j <= p.degree(); ++j) {
        res.add(Functions.GCD.z(p.coeff(k), p.coeff(j)));
      }
    }
    Collections.sort(res);
    return res;
  }

  /** Construct the sequence. */
  public A078490() {
    super(0, FINITE, build());
  }
}


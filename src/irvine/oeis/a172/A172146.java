package irvine.oeis.a172;

import java.util.Collection;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A172146 Primes of form x^y + y^x + 1 with x &lt;= y &lt; 50.
 * @author Sean A. Irvine
 */
public class A172146 extends FiniteSequence {

  private static Collection<Z> build() {
    final TreeSet<Z> res = new TreeSet<>();
    for (long x = 1; x < 50; ++x) {
      for (long y = 1; y <= x; ++y) {
        final Z t = Z.valueOf(x).pow(y).add(Z.valueOf(y).pow(x)).add(1);
        if (t.isProbablePrime()) {
          res.add(t);
        }
      }
    }
    return res;
  }

  /** Construct the sequence. */
  public A172146() {
    super(1, FINITE, build());
  }
}

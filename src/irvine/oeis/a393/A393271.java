package irvine.oeis.a393;
// manually 2026-02-19/decexp at 2026-02-19 15:59

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A393271 Decimal expansion of the probability that at least 3 of 88 randomly selected persons have the same birthday, not considering leap years.
 * Formula: <code>p(n, m) = 1 -(m!*n!/m^n) * sum(k = 0, n\2, 1/(2^k*k!*(n - 2*k)!*(m - n + k)!));</code>
 * @author Georg Fischer
 */
public class A393271 extends DecimalExpansionSequence {

  private static CR quot(final int n, final int m) {
    return CR.ONE.subtract(CR.valueOf(new Q(Functions.FACTORIAL.z(m).multiply(Functions.FACTORIAL.z(n)), Z.valueOf(m).pow(n))
      .multiply(Rationals.SINGLETON.sum(0, n / 2, k -> new Q(Z.ONE, Z.TWO.pow(k).multiply(Functions.FACTORIAL.z(k))
        .multiply(Functions.FACTORIAL.z(n - 2 * k)).multiply(Functions.FACTORIAL.z(m - n + k)))))));
  }

  /** Construct the sequence */
  public A393271() {
    super(0, quot(88, 365));
  }
}

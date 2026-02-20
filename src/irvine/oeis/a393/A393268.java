package irvine.oeis.a393;
// manually 2026-02-19/decexp at 2026-02-19 15:59

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A393268 Decimal expansion of the probability that in a randomly selected group of 16 girls and 16 boys there is at least one girl-boy pair with a matching birthday, not considering leap years.
 * Formula: <code>p(n, m) = 1 - (1/m^(2*n)) * sum(k = 1, n, (m-k)^n * m!/(m-k)! * stirling(n, k, 2));</code>
 * @author Georg Fischer
 */
public class A393268 extends DecimalExpansionSequence {

  private static CR quot(final int n, final int m) {
    return CR.ONE.subtract(CR.valueOf(new Q(Z.ONE, Z.valueOf(m).pow(2 * n))).multiply(Rationals.SINGLETON.sum(1, n, k -> new Q(Z.valueOf(m - k).pow(n)
      .multiply(Functions.FACTORIAL.z(m)).multiply(Functions.STIRLING2.z(n, k)), Functions.FACTORIAL.z(m - k)))));
  }

  /** Construct the sequence */
  public A393268() {
    super(0, quot(16, 365));
  }
}

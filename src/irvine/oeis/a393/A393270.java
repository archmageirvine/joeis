package irvine.oeis.a393;
// manually 2026-02-19/decexp at 2026-02-19 15:59

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A393270 Decimal expansion of the probability that at least 2 of 14 randomly selected people have a birthday within a day of each other, not considering leap years.
 * Formula: <code>p(n, m) = 1 -(n-1)! * binomial(m-n-1, n-1) / m^(n-1); list(len) = digits(floor(p(14, 365)*10^len));</code>
 * @author Georg Fischer
 */
public class A393270 extends DecimalExpansionSequence {

  private static CR quot(final int n, final int m) {
    return CR.ONE.subtract(CR.valueOf(new Q(Functions.FACTORIAL.z(n - 1).multiply(Binomial.binomial(m - n - 1, n - 1)), Z.valueOf(m).pow(n - 1))));
  }

  /** Construct the sequence */
  public A393270() {
    super(0, quot(14, 365));
  }
}

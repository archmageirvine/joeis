package irvine.oeis.a338;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A338186 Expansion of g.f. 2*(1-3*x-6*x^2)/((1-x)^2*(1-9*x)).
 * This implementation uses the generic function.
 * The version which assumes (verifies) the conjecture that <code>A322469(a(k)) = 4^(k+1)</code>
 * is in <a href="https://github/gfis/joeis-alt/src/irvine/oeis/a338">a338</a>.
 *
 * @author Georg Fischer
 */
public class A338186 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A338186() {
    super(0, "[2, -6, -12]", "[1, -11, 19, -9]");
  }
}

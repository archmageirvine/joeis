package irvine.oeis.a393;
// manually 2026-02-10/decexp at 2026-02-10 18:09

import irvine.math.cr.CR;
import irvine.oeis.a006.A006752;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A393257 Decimal expansion of Pi*G, where G is Catalan's constant (A006752).
 * @author Georg Fischer
 */
public class A393257 extends DecimalExpansionSequence {

  private static final DecimalExpansionSequence A006752 = new A006752();

  /** Construct the sequence */
  public A393257() {
    super(1, CR.PI.multiply(A006752.getCR()));
  }
}

package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A393288 Decimal expansion of 1 + e - gamma, where gamma is the Euler-Mascheroni constant (A001620).
 * @author Sean A. Irvine
 */
public class A393288 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A393288() {
    super(1, CR.E.add(1).subtract(CR.GAMMA));
  }
}

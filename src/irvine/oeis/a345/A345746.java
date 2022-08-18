package irvine.oeis.a345;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A345746 Decimal expansion of Pi^(-1/9).
 * @author Sean A. Irvine
 */
public class A345746 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A345746() {
    super(0, CR.PI.pow(CR.valueOf(new Q(-1, 9))));
  }
}

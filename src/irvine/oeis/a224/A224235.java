package irvine.oeis.a224;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A224235 Decimal expansion of number of yards in a meter.
 * The exact value (this is the definition of a yard) is 1/0.9144.
 * @author Georg Fischer
 */
public class A224235 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A224235() {
    super(CR.valueOf(new Q(10000, 9144)));
  }
}

package irvine.oeis.a348;
// Generated by gen_seq4.pl 2025-02-08.ack/decexpr at 2025-02-08 20:47

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A348896 Decimal expansion of 2*(sin(Pi/38) - sin((7*Pi)/38) + cos((4*Pi)/19)).
 * Formula:
 * @author Georg Fischer
 */
public class A348896 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence */
  public A348896() {
    super(0, CR.TWO.multiply(REALS.sin(CR.PI.divide(CR.valueOf(38))).subtract(REALS.sin(CR.SEVEN.multiply(CR.PI).divide(CR.valueOf(38)))).add(REALS.cos(CR.FOUR.multiply(CR.PI).divide(CR.valueOf(19))))));
  }
}

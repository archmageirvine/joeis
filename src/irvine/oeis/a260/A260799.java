package irvine.oeis.a260;
// Generated by gen_seq4.pl decexp at 2021-07-12 23:03

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A260799 Decimal expansion of the continued fraction e/(Pi+e/(Pi+e/(...))).
 * @author Georg Fischer
 */
public class A260799 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A260799() {
    super(0, CR.PI.multiply(CR.PI).add(CR.FOUR.multiply(CR.E)).sqrt().subtract(CR.PI).divide(CR.TWO));
  }
}

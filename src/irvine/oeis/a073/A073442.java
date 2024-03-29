package irvine.oeis.a073;
// Generated by gen_seq4.pl decexpr at 2021-07-18 19:09

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A073442 Decimal expansion of cot (Pi degrees) (of course cot (Pi radians) is undefined).
 * Formula: cot(Pi^2/180)
 * @author Georg Fischer
 */
public class A073442 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A073442() {
    super(2, REALS.cot(CR.PI.pow(CR.TWO).divide(CR.valueOf(180))));
  }
}

package irvine.oeis.a332;
// Generated by gen_seq4.pl decexpr at 2021-07-12 23:03

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A332892 Decimal expansion of Sum_{k&gt;=0} 1/(6*k)!.
 * @author Georg Fischer
 */
public class A332892 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A332892() {
    super(1, CR.ONE.divide(CR.THREE).multiply(REALS.cosh(CR.ONE).add(CR.TWO.multiply(REALS.cosh(CR.ONE.divide(CR.TWO))).multiply(CR.THREE.sqrt().divide(CR.TWO).cos()))));
  }
}

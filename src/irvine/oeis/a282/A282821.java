package irvine.oeis.a282;
// Generated by gen_seq4.pl decexp at 2021-07-12 23:03

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A282821 Decimal expansion of Sum_{k &gt;= 0} (4/(4*k+1) - 3/(3*k+1) + 2/(2*k+1) - 1/(k+1)).
 * @author Georg Fischer
 */
public class A282821 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A282821() {
    super(1, CR.THREE.subtract(CR.THREE.sqrt()).multiply(CR.PI).divide(CR.SIX).add(CR.valueOf(32).log()).subtract(CR.valueOf(27).log().divide(CR.TWO)));
  }
}

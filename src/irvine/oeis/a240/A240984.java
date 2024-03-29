package irvine.oeis.a240;
// Generated by gen_seq4.pl decexp at 2021-07-19 22:15

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A240984 Decimal expansion of the infinite product of e*(1-1/n^2)^(n^2) for n &gt;= 2, which evaluates as Pi/e^(3/2).
 * Formula: Pi/exp(3/2)
 * @author Georg Fischer
 */
public class A240984 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A240984() {
    super(0, CR.PI.divide(CR.THREE.divide(CR.TWO).exp()));
  }
}

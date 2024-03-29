package irvine.oeis.a193;
// Generated by gen_seq4.pl decexp at 2021-07-16 22:36

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A193178 Decimal expansion of (1/2)^(1/2)^(1/2)^(1/2).
 * Formula: (1/2)^(1/2)^(1/2)^(1/2)
 * @author Georg Fischer
 */
public class A193178 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A193178() {
    super(0, CR.ONE.divide(CR.TWO).pow(CR.ONE.divide(CR.TWO).pow(CR.ONE.divide(CR.TWO).pow(CR.ONE.divide(CR.TWO)))));
  }
}

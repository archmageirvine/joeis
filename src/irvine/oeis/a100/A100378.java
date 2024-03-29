package irvine.oeis.a100;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A100378 Decimal expansion of exp(Pi*sqrt(89/3)).
 * @author Georg Fischer
 */
public class A100378 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A100378() {
    super(8, CR.PI.multiply(CR.valueOf(89).divide(CR.THREE).sqrt()).exp());
  }
}

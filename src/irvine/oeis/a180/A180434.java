package irvine.oeis.a180;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A180434 Decimal expansion of constant (2 - Pi/2).
 * @author Georg Fischer
 */
public class A180434 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A180434() {
    super(0, CR.TWO.subtract(CR.PI.divide(CR.TWO)));
  }
}

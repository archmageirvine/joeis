package irvine.oeis.a177;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A177015 Decimal expansion of (124+sqrt(16926))/25.
 * @author Georg Fischer
 */
public class A177015 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A177015() {
    super(2, CR.valueOf(124).add(CR.valueOf(16926).sqrt()).divide(CR.valueOf(25)));
  }
}

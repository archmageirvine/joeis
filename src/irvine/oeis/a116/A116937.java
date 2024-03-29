package irvine.oeis.a116;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A116937 Expansion of Pi^2 in base 2.
 * @author Georg Fischer
 */
public class A116937 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A116937() {
    super(1, CR.PI.multiply(CR.PI), 2);
  }
}

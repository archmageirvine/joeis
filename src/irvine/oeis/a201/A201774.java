package irvine.oeis.a201;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A201774 Decimal expansion of 1/(Pi + 1).
 * @author Georg Fischer
 */
public class A201774 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A201774() {
    super(0, CR.ONE.divide(CR.PI.add(CR.ONE)));
  }
}

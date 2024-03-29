package irvine.oeis.a085;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A085660 Decimal expansion of -cos(e).
 * @author Georg Fischer
 */
public class A085660 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A085660() {
    super(0, CR.E.cos().negate());
  }
}

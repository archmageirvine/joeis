package irvine.oeis.a177;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A177839 Decimal expansion of sqrt(2442).
 * @author Georg Fischer
 */
public class A177839 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A177839() {
    super(2, CR.valueOf(2442).sqrt());
  }
}

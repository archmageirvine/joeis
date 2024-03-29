package irvine.oeis.a303;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A303274 Decimal expansion of 1200/3937.
 * @author Georg Fischer
 */
public class A303274 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A303274() {
    super(0, CR.valueOf(1200).divide(CR.valueOf(3937)));
  }
}

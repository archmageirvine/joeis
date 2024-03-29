package irvine.oeis.a093;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A093070 Decimal expansion of 128/(45*Pi).
 * @author Georg Fischer
 */
public class A093070 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A093070() {
    super(0, CR.valueOf(128).divide(CR.valueOf(45).multiply(CR.PI)));
  }
}

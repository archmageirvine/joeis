package irvine.oeis.a171;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A171547 Decimal expansion of sqrt(3/14).
 * @author Georg Fischer
 */
public class A171547 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A171547() {
    super(0, CR.THREE.divide(CR.valueOf(14)).sqrt());
  }
}

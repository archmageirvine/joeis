package irvine.oeis.a100;
// Generated by gen_seq4.pl dex CR.FOUR.log().divide(CR.THREE.log()) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A100831 Decimal expansion of log(4)/log(3).
 * @author Georg Fischer
 */
public class A100831 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A100831() {
    super(CR.FOUR.log().divide(CR.THREE.log()));
  }
}

package irvine.oeis.a194;
// Generated by gen_seq4.pl dex CR.valueOf(127).log().divide(CR.valueOf(16).log()) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A194361 Decimal expansion of log(127) / log(16).
 * @author Georg Fischer
 */
public class A194361 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A194361() {
    super(CR.valueOf(127).log().divide(CR.valueOf(16).log()));
  }
}

package irvine.oeis.a176;
// Generated by gen_seq4.pl dex CR.FOUR.add(CR.valueOf(17).sqrt()) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A176458 Decimal expansion of 4+sqrt(17).
 * @author Georg Fischer
 */
public class A176458 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A176458() {
    super(CR.FOUR.add(CR.valueOf(17).sqrt()));
  }
}

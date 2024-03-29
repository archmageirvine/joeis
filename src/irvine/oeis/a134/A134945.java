package irvine.oeis.a134;
// Generated by gen_seq4.pl dex CR.ONE.add(CR.FIVE.sqrt()) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A134945 Decimal expansion of 1 + sqrt(5).
 * @author Georg Fischer
 */
public class A134945 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A134945() {
    super(CR.ONE.add(CR.FIVE.sqrt()));
  }
}

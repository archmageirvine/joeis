package irvine.oeis.a157;
// Generated by gen_seq4.pl dex CR.SEVEN.subtract(CR.TWO.multiply(CR.SQRT2)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A157259 Decimal expansion of 7 - 2*sqrt(2).
 * @author Georg Fischer
 */
public class A157259 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A157259() {
    super(CR.SEVEN.subtract(CR.TWO.multiply(CR.SQRT2)));
  }
}

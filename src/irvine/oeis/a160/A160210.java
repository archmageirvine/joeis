package irvine.oeis.a160;
// Generated by gen_seq4.pl dex CR.valueOf(1179).add(CR.valueOf(506).multiply(CR.SQRT2)).divide(CR.valueOf(937)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A160210 Decimal expansion of (1179+506*sqrt(2))/937.
 * @author Georg Fischer
 */
public class A160210 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A160210() {
    super(CR.valueOf(1179).add(CR.valueOf(506).multiply(CR.SQRT2)).divide(CR.valueOf(937)));
  }
}

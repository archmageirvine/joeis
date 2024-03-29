package irvine.oeis.a159;
// Generated by gen_seq4.pl dex CR.valueOf(731).add(CR.valueOf(54).multiply(CR.SQRT2)).divide(CR.valueOf(727)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A159894 Decimal expansion of (731+54*sqrt(2))/727.
 * @author Georg Fischer
 */
public class A159894 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A159894() {
    super(CR.valueOf(731).add(CR.valueOf(54).multiply(CR.SQRT2)).divide(CR.valueOf(727)));
  }
}

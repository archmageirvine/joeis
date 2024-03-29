package irvine.oeis.a178;
// Generated by gen_seq4.pl dex CR.valueOf(243).add(CR.valueOf(17).multiply(CR.valueOf(285).sqrt())).divide(CR.valueOf(402)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A178148 Decimal expansion of (243+17*sqrt(285))/402.
 * @author Georg Fischer
 */
public class A178148 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A178148() {
    super(CR.valueOf(243).add(CR.valueOf(17).multiply(CR.valueOf(285).sqrt())).divide(CR.valueOf(402)));
  }
}

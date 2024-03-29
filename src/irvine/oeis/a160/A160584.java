package irvine.oeis.a160;
// Generated by gen_seq4.pl dex CR.valueOf(537).add(CR.valueOf(92).multiply(CR.SQRT2)).divide(CR.valueOf(521)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A160584 Decimal expansion of (537 +92*sqrt(2))/521.
 * @author Georg Fischer
 */
public class A160584 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A160584() {
    super(CR.valueOf(537).add(CR.valueOf(92).multiply(CR.SQRT2)).divide(CR.valueOf(521)));
  }
}

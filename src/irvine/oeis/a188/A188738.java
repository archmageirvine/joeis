package irvine.oeis.a188;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A188738 Decimal expansion of e-sqrt(e^2-1).
 * @author Sean A. Irvine
 */
public class A188738 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A188738() {
    super(CR.E.subtract(CR.TWO.exp().subtract(CR.ONE).sqrt()));
  }
}

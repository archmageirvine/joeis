package irvine.oeis.a156;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A156164 Decimal expansion of 17 + 12*sqrt(2).
 * @author Sean A. Irvine
 */
public class A156164 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A156164() {
    super(2, CR.valueOf(17).add(CR.valueOf(288).sqrt()));
  }
}

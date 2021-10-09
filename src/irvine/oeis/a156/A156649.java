package irvine.oeis.a156;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A156649 Decimal expansion of (9+4*sqrt(2))/7.
 * @author Sean A. Irvine
 */
public class A156649 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A156649() {
    super(CR.NINE.add(CR.valueOf(32).sqrt()).divide(CR.SEVEN));
  }
}

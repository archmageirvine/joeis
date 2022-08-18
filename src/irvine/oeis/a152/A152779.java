package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A152779 Decimal expansion of log_13 (2).
 * @author Sean A. Irvine
 */
public class A152779 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A152779() {
    super(0, CR.TWO.log().divide(CR.valueOf(13).log()));
  }
}

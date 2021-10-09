package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155821 Decimal expansion of log_5 (23).
 * @author Sean A. Irvine
 */
public class A155821 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155821() {
    super(CR.valueOf(23).log().divide(CR.FIVE.log()));
  }
}

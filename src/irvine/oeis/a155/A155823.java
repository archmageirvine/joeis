package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155823 Decimal expansion of log_6 (23).
 * @author Sean A. Irvine
 */
public class A155823 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155823() {
    super(CR.valueOf(23).log().divide(CR.SIX.log()));
  }
}

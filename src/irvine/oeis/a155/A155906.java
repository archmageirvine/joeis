package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155906 Decimal expansion of log_19 (23).
 * @author Sean A. Irvine
 */
public class A155906 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155906() {
    super(CR.valueOf(23).log().divide(CR.valueOf(19).log()));
  }
}

package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155678 Decimal expansion of log_11 (21).
 * @author Sean A. Irvine
 */
public class A155678 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155678() {
    super(CR.valueOf(21).log().divide(CR.valueOf(11).log()));
  }
}

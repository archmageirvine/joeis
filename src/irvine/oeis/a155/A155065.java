package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155065 Decimal expansion of log_13 (19).
 * @author Sean A. Irvine
 */
public class A155065 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155065() {
    super(CR.valueOf(19).log().divide(CR.valueOf(13).log()));
  }
}

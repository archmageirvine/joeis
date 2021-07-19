package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155837 Decimal expansion of log_13 (23).
 * @author Sean A. Irvine
 */
public class A155837 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155837() {
    super(CR.valueOf(23).log().divide(CR.valueOf(13).log()));
  }
}

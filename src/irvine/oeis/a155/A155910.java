package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155910 Decimal expansion of log_22 (23).
 * @author Sean A. Irvine
 */
public class A155910 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155910() {
    super(CR.valueOf(23).log().divide(CR.valueOf(22).log()));
  }
}

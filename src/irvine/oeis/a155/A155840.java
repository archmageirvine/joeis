package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155840 Decimal expansion of log_14 (23).
 * @author Sean A. Irvine
 */
public class A155840 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155840() {
    super(CR.valueOf(23).log().divide(CR.valueOf(14).log()));
  }
}

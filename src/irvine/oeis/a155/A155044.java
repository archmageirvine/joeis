package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155044 Decimal expansion of log_6 (19).
 * @author Sean A. Irvine
 */
public class A155044 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155044() {
    super(CR.valueOf(19).log().divide(CR.SIX.log()));
  }
}

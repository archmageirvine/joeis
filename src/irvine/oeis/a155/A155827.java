package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155827 Decimal expansion of log_8 (23).
 * @author Sean A. Irvine
 */
public class A155827 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155827() {
    super(CR.valueOf(23).log().divide(CR.EIGHT.log()));
  }
}

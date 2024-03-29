package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155880 Decimal expansion of log_17 (23).
 * @author Sean A. Irvine
 */
public class A155880 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155880() {
    super(CR.valueOf(23).log().divide(CR.valueOf(17).log()));
  }
}

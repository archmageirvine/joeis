package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155855 Decimal expansion of log_15 (23).
 * @author Sean A. Irvine
 */
public class A155855 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155855() {
    super(CR.valueOf(23).log().divide(CR.valueOf(15).log()));
  }
}

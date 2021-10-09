package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016644 Decimal expansion of log(21).
 * @author Sean A. Irvine
 */
public class A016644 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016644() {
    super(CR.valueOf(21).log());
  }
}

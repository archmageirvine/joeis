package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016676 Decimal expansion of log(53).
 * @author Sean A. Irvine
 */
public class A016676 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016676() {
    super(CR.valueOf(53).log());
  }
}

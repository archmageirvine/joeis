package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016654 Decimal expansion of log(31).
 * @author Sean A. Irvine
 */
public class A016654 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016654() {
    super(CR.valueOf(31).log());
  }
}

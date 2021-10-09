package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016680 Decimal expansion of log(57).
 * @author Sean A. Irvine
 */
public class A016680 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016680() {
    super(CR.valueOf(57).log());
  }
}

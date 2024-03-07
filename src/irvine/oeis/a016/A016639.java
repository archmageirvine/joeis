package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016639 Decimal expansion of log(16) = 4*log(2).
 * @author Sean A. Irvine
 */
public class A016639 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016639() {
    super(CR.valueOf(16).log());
  }
}

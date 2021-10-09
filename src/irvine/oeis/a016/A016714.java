package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016714 Decimal expansion of log(91).
 * @author Sean A. Irvine
 */
public class A016714 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016714() {
    super(CR.valueOf(91).log());
  }
}

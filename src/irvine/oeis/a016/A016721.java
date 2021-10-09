package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016721 Decimal expansion of log(98).
 * @author Sean A. Irvine
 */
public class A016721 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016721() {
    super(CR.valueOf(98).log());
  }
}

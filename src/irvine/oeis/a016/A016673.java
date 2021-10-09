package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016673 Decimal expansion of log(50).
 * @author Sean A. Irvine
 */
public class A016673 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016673() {
    super(CR.valueOf(50).log());
  }
}

package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016690 Decimal expansion of log(67).
 * @author Sean A. Irvine
 */
public class A016690 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016690() {
    super(CR.valueOf(67).log());
  }
}

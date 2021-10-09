package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020864 Decimal expansion of log(12)/log(2).
 * @author Sean A. Irvine
 */
public class A020864 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020864() {
    super(CR.valueOf(12).log().divide(CR.TWO.log()));
  }
}

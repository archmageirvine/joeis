package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020847 Decimal expansion of 1/sqrt(90) = sqrt(10)/30.
 * @author Sean A. Irvine
 */
public class A020847 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020847() {
    super(CR.valueOf(90).sqrt().inverse());
  }
}

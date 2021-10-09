package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020795 Decimal expansion of 1/sqrt(38).
 * @author Sean A. Irvine
 */
public class A020795 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020795() {
    super(CR.valueOf(38).sqrt().inverse());
  }
}

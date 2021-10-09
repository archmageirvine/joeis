package irvine.oeis.a222;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A222066 Decimal expansion of 1/sqrt(128).
 * @author Sean A. Irvine
 */
public class A222066 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A222066() {
    super(CR.valueOf(128).sqrt().inverse());
  }
}

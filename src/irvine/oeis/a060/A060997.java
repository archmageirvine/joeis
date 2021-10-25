package irvine.oeis.a060;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A060997 Decimal representation of continued fraction 1, 2, 3, 4, 5, 6, 7, ...
 * @author Sean A. Irvine
 */
public class A060997 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A060997() {
    super(CR.TWO.besselI0().divide(CR.TWO.besselI(1)));
  }
}

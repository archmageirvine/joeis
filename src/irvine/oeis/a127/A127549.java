package irvine.oeis.a127;

import irvine.oeis.a006.A006005;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A127549 Decimal expansion of the number 1.31303673643358290638395160264... having continued fraction expansion 1, 3, 5, 7, 11, 13, 17, 19, ...
 * @author Sean A. Irvine
 */
public class A127549 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A127549() {
    super(1, new A006005());
  }
}

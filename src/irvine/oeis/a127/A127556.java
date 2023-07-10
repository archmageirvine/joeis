package irvine.oeis.a127;

import irvine.oeis.a024.A024675;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A127556 Decimal expansion of the number 4.1636635147332912770473687837946011358... having continued fraction expansion 4, 6, 9, 12, 15, 18, 21, 26, 30, 34, 39, ... (arithmetical average of two consecutive odd primes A024675).
 * @author Sean A. Irvine
 */
public class A127556 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A127556() {
    super(1, new A024675());
  }
}

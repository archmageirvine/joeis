package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041206 Numerators of continued fraction convergents to <code>sqrt(114)</code>.
 * @author Sean A. Irvine
 */
public class A041206 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041206() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 2050, 0, 0, 0, 0, 0}, new long[] {10, 11, 32, 331, 694, 1025, 21194, 22219, 65632, 678539, 1422710, 2101249});
  }
}

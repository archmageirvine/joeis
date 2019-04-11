package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041542 Numerators of continued fraction convergents to <code>sqrt(288)</code>.
 * @author Sean A. Irvine
 */
public class A041542 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041542() {
    super(new long[] {-1, 0, 34, 0}, new long[] {16, 17, 560, 577});
  }
}

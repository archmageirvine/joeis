package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041594 Numerators of continued fraction convergents to <code>sqrt(315)</code>.
 * @author Sean A. Irvine
 */
public class A041594 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041594() {
    super(new long[] {-1, 0, 0, 0, 142, 0, 0, 0}, new long[] {17, 18, 53, 71, 2467, 2538, 7543, 10081});
  }
}

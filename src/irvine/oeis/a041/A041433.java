package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041433 Denominators of continued fraction convergents to <code>sqrt(232)</code>.
 * @author Sean A. Irvine
 */
public class A041433 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041433() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 39206, 0, 0, 0, 0, 0}, new long[] {1, 4, 13, 95, 298, 1287, 38908, 156919, 509665, 3724574, 11683387, 50458122});
  }
}

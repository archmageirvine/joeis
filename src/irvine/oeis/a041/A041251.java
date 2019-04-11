package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041251 Denominators of continued fraction convergents to <code>sqrt(137)</code>.
 * @author Sean A. Irvine
 */
public class A041251 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041251() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 3488, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 3, 7, 10, 17, 44, 105, 149, 3383, 3532, 10447, 24426, 34873, 59299, 153471, 366241, 519712});
  }
}

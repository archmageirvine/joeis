package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041681 Denominators of continued fraction convergents to <code>sqrt(359)</code>.
 * @author Sean A. Irvine
 */
public class A041681 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041681() {
    super(new long[] {-1, 0, 0, 0, 720, 0, 0, 0}, new long[] {1, 1, 18, 19, 702, 721, 12959, 13680});
  }
}

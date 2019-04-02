package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041647 Denominators of continued fraction convergents to sqrt(342).
 * @author Sean A. Irvine
 */
public class A041647 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041647() {
    super(new long[] {-1, 0, 74, 0}, new long[] {1, 2, 73, 148});
  }
}

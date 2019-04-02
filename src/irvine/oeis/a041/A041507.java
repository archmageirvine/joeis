package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041507 Denominators of continued fraction convergents to sqrt(270).
 * @author Sean A. Irvine
 */
public class A041507 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041507() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 10582, 0, 0, 0, 0, 0}, new long[] {1, 2, 7, 44, 139, 322, 10443, 21208, 74067, 465610, 1470897, 3407404});
  }
}

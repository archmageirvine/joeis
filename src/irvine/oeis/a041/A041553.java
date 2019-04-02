package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041553 Denominators of continued fraction convergents to sqrt(294).
 * @author Sean A. Irvine
 */
public class A041553 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041553() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 9602, 0, 0, 0, 0, 0}, new long[] {1, 6, 7, 34, 41, 280, 9561, 57646, 67207, 326474, 393681, 2688560});
  }
}

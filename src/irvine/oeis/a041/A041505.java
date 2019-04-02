package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041505 Denominators of continued fraction convergents to sqrt(269).
 * @author Sean A. Irvine
 */
public class A041505 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041505() {
    super(new long[] {1, 0, 0, 164, 0, 0}, new long[] {1, 2, 5, 162, 329, 820});
  }
}

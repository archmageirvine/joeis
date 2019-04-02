package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041011 Denominators of continued fraction convergents to sqrt(8).
 * @author Sean A. Irvine
 */
public class A041011 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041011() {
    super(new long[] {-1, 0, 6, 0}, new long[] {0, 1, 1, 5});
  }
}

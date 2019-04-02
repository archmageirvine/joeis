package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041449 Denominators of continued fraction convergents to sqrt(240).
 * @author Sean A. Irvine
 */
public class A041449 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041449() {
    super(new long[] {-1, 0, 62, 0}, new long[] {1, 2, 61, 124});
  }
}

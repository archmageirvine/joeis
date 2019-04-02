package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041031 Denominators of continued fraction convergents to sqrt(20).
 * @author Sean A. Irvine
 */
public class A041031 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041031() {
    super(new long[] {-1, 0, 18, 0}, new long[] {1, 2, 17, 36});
  }
}

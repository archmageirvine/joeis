package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041041 Denominators of continued fraction convergents to sqrt(26).
 * @author Sean A. Irvine
 */
public class A041041 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041041() {
    super(new long[] {1, 10}, new long[] {1, 10});
  }
}

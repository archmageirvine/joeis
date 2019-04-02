package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041403 Denominators of continued fraction convergents to sqrt(216).
 * @author Sean A. Irvine
 */
public class A041403 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041403() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 970, 0, 0, 0, 0, 0}, new long[] {1, 1, 3, 10, 23, 33, 947, 980, 2907, 9701, 22309, 32010});
  }
}

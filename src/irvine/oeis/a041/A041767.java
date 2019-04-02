package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041767 Denominators of continued fraction convergents to sqrt(404).
 * @author Sean A. Irvine
 */
public class A041767 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041767() {
    super(new long[] {-1, 0, 402, 0}, new long[] {1, 10, 401, 4020});
  }
}

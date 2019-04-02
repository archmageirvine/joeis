package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041415 Denominators of continued fraction convergents to sqrt(222).
 * @author Sean A. Irvine
 */
public class A041415 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041415() {
    super(new long[] {-1, 0, 0, 0, 298, 0, 0, 0}, new long[] {1, 1, 9, 10, 289, 299, 2681, 2980});
  }
}

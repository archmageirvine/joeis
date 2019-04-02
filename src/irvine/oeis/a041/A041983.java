package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041983 Denominators of continued fraction convergents to sqrt(514).
 * @author Sean A. Irvine
 */
public class A041983 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041983() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 9250, 0, 0, 0, 0, 0}, new long[] {1, 1, 3, 67, 137, 204, 9113, 9317, 27747, 619751, 1267249, 1887000});
  }
}

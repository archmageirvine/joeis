package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041663 Denominators of continued fraction convergents to sqrt(350).
 * @author Sean A. Irvine
 */
public class A041663 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041663() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 898, 0, 0, 0, 0, 0}, new long[] {1, 1, 3, 7, 17, 24, 881, 905, 2691, 6287, 15265, 21552});
  }
}

package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041435 Denominators of continued fraction convergents to sqrt(233).
 * @author Sean A. Irvine
 */
public class A041435 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041435() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 46312, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 3, 4, 15, 19, 34, 53, 87, 314, 401, 1517, 45911, 139250, 185161, 694733, 879894, 1574627, 2454521, 4029148, 14541965, 18571113, 70255304});
  }
}

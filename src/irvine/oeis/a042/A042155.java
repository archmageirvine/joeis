package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042155 Denominators of continued fraction convergents to sqrt(602).
 * @author Sean A. Irvine
 */
public class A042155 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042155() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 1374, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 13, 15, 28, 1359, 1387, 2746, 17863, 20609, 38472});
  }
}

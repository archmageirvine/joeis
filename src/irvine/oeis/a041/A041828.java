package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041828 Numerators of continued fraction convergents to sqrt(435).
 * @author Sean A. Irvine
 */
public class A041828 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041828() {
    super(new long[] {-1, 0, 0, 0, 292, 0, 0, 0}, new long[] {20, 21, 125, 146, 5965, 6111, 36520, 42631});
  }
}

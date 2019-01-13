package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198402.
 * @author Sean A. Irvine
 */
public class A198402 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198402() {
    super(new long[] {-15625, 18750, -9375, 2500, -375, 30}, new long[] {0, 5, 800, 30375, 640000, 9765625});
  }
}

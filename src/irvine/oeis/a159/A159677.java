package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159677 Expansion of 64*x^2/(-x^3 + 1023*x^2 - 1023*x + 1).
 * @author Sean A. Irvine
 */
public class A159677 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159677() {
    super(new long[] {1, -1023, 1023}, new long[] {0, 0, 64});
  }
}

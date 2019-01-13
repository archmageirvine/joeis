package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122186.
 * @author Sean A. Irvine
 */
public class A122186 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122186() {
    super(new long[] {-1, -4, 21, 23}, new long[] {1, 30, 707, 16886});
  }
}

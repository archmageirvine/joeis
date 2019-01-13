package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122365.
 * @author Sean A. Irvine
 */
public class A122365 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122365() {
    super(new long[] {-1, 4, 2}, new long[] {0, 1, 1});
  }
}

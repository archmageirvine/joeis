package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122161.
 * @author Sean A. Irvine
 */
public class A122161 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122161() {
    super(new long[] {-1, 2, 1}, new long[] {1, -2, 1});
  }
}

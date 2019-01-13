package irvine.oeis.a241;

import irvine.oeis.LinearRecurrence;

/**
 * A241848.
 * @author Sean A. Irvine
 */
public class A241848 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241848() {
    super(new long[] {1, -3, 3}, new long[] {18, 19, 22});
  }
}

package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174338.
 * @author Sean A. Irvine
 */
public class A174338 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174338() {
    super(new long[] {1, -3, 3}, new long[] {0, 97, 388});
  }
}

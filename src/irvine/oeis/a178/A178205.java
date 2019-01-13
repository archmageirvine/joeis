package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178205.
 * @author Sean A. Irvine
 */
public class A178205 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178205() {
    super(new long[] {10, 0, 1}, new long[] {1, 1, 1});
  }
}

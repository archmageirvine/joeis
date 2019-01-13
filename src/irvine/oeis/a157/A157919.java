package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157919.
 * @author Sean A. Irvine
 */
public class A157919 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157919() {
    super(new long[] {1, -3, 3}, new long[] {49, 199, 449});
  }
}

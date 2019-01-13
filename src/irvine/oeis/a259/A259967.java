package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259967.
 * @author Sean A. Irvine
 */
public class A259967 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259967() {
    super(new long[] {1, -1, 2}, new long[] {3, 2, 2});
  }
}

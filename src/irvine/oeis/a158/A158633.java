package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158633.
 * @author Sean A. Irvine
 */
public class A158633 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158633() {
    super(new long[] {1, -3, 3}, new long[] {506, 2093, 4738});
  }
}

package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158403.
 * @author Sean A. Irvine
 */
public class A158403 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158403() {
    super(new long[] {1, -3, 3}, new long[] {843, 3368, 7575});
  }
}

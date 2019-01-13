package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158675.
 * @author Sean A. Irvine
 */
public class A158675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158675() {
    super(new long[] {1, -3, 3}, new long[] {31, 992, 3875});
  }
}

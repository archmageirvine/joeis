package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158733.
 * @author Sean A. Irvine
 */
public class A158733 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158733() {
    super(new long[] {1, -3, 3}, new long[] {35, 1260, 4935});
  }
}

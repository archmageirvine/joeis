package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158547.
 * @author Sean A. Irvine
 */
public class A158547 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158547() {
    super(new long[] {1, -3, 3}, new long[] {1, 25, 97});
  }
}

package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020000.
 * @author Sean A. Irvine
 */
public class A020000 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020000() {
    super(new long[] {385, -167, 23}, new long[] {1, 23, 362});
  }
}

package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193394.
 * @author Sean A. Irvine
 */
public class A193394 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193394() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {42, 215, 636, 1513, 3118});
  }
}

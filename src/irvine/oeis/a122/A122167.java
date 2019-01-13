package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122167.
 * @author Sean A. Irvine
 */
public class A122167 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122167() {
    super(new long[] {2, -7, 3, 2}, new long[] {1, -3, 3, -11});
  }
}

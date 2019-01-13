package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122368.
 * @author Sean A. Irvine
 */
public class A122368 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122368() {
    super(new long[] {3, -9, 6}, new long[] {1, 3, 11});
  }
}

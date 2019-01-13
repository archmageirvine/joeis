package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122112.
 * @author Sean A. Irvine
 */
public class A122112 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122112() {
    super(new long[] {4, -1}, new long[] {1, -2});
  }
}

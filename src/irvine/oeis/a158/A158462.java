package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158462.
 * @author Sean A. Irvine
 */
public class A158462 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158462() {
    super(new long[] {1, -3, 3}, new long[] {30, 138, 318});
  }
}

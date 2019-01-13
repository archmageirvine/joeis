package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090809.
 * @author Sean A. Irvine
 */
public class A090809 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090809() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 2, 10, 31});
  }
}

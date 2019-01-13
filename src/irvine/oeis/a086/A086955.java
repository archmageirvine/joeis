package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086955.
 * @author Sean A. Irvine
 */
public class A086955 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086955() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 6, 9, 18});
  }
}

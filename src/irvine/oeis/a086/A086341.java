package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086341.
 * @author Sean A. Irvine
 */
public class A086341 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086341() {
    super(new long[] {2, 2, -1}, new long[] {1, 3, 3});
  }
}

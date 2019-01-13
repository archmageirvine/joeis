package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192875.
 * @author Sean A. Irvine
 */
public class A192875 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192875() {
    super(new long[] {4, -6, -5, 6, 2}, new long[] {0, 1, 3, 11, 37});
  }
}

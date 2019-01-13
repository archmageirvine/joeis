package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086192.
 * @author Sean A. Irvine
 */
public class A086192 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086192() {
    super(new long[] {1, 1, 1}, new long[] {1, 4, 9});
  }
}

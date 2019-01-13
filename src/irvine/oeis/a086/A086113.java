package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086113.
 * @author Sean A. Irvine
 */
public class A086113 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086113() {
    super(new long[] {-1, 4, -6, 4}, new long[] {6, 36, 102, 216});
  }
}

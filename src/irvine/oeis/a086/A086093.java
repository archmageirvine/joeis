package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086093.
 * @author Sean A. Irvine
 */
public class A086093 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086093() {
    super(new long[] {48, -40, 11}, new long[] {1, 5, 25});
  }
}

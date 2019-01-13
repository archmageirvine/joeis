package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086940.
 * @author Sean A. Irvine
 */
public class A086940 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086940() {
    super(new long[] {-10, 11}, new long[] {16, 196});
  }
}

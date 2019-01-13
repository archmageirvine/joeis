package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103322.
 * @author Sean A. Irvine
 */
public class A103322 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103322() {
    super(new long[] {-1, -2, -2, 1, 2, 1}, new long[] {1, 1, 3, 6, 11, 22});
  }
}

package irvine.oeis.a202;

import irvine.oeis.LinearRecurrence;

/**
 * A202804.
 * @author Sean A. Irvine
 */
public class A202804 extends LinearRecurrence {

  /** Construct the sequence. */
  public A202804() {
    super(new long[] {1, -3, 3}, new long[] {0, 10, 32});
  }
}

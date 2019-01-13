package irvine.oeis.a202;

import irvine.oeis.LinearRecurrence;

/**
 * A202141.
 * @author Sean A. Irvine
 */
public class A202141 extends LinearRecurrence {

  /** Construct the sequence. */
  public A202141() {
    super(new long[] {1, -3, 3}, new long[] {5, 2, 25});
  }
}

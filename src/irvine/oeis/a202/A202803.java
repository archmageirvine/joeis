package irvine.oeis.a202;

import irvine.oeis.LinearRecurrence;

/**
 * A202803.
 * @author Sean A. Irvine
 */
public class A202803 extends LinearRecurrence {

  /** Construct the sequence. */
  public A202803() {
    super(new long[] {1, -3, 3}, new long[] {0, 6, 22});
  }
}

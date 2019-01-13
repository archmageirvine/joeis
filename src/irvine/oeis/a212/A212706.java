package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212706.
 * @author Sean A. Irvine
 */
public class A212706 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212706() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {81, 5825, 73745, 461313, 1951057, 6418369, 17712657, 42921473});
  }
}

package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111466.
 * @author Sean A. Irvine
 */
public class A111466 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111466() {
    super(new long[] {1, 0, 0, 4, 0, 0}, new long[] {1, 0, 2, 5, 0, 8});
  }
}

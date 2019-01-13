package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289918.
 * @author Sean A. Irvine
 */
public class A289918 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289918() {
    super(new long[] {-1, 0, 0, 2, 1, 0}, new long[] {0, 1, 0, 1, 2, 1});
  }
}

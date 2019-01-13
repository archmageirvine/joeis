package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179298.
 * @author Sean A. Irvine
 */
public class A179298 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179298() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 7, 18, 28, 25});
  }
}

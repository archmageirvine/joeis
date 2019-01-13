package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179994.
 * @author Sean A. Irvine
 */
public class A179994 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179994() {
    super(new long[] {-8, 0, 11, 0}, new long[] {0, 1, 5, 12});
  }
}

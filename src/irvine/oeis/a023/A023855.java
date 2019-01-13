package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023855.
 * @author Sean A. Irvine
 */
public class A023855 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023855() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 2, 7, 10, 22, 28, 50});
  }
}

package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070404.
 * @author Sean A. Irvine
 */
public class A070404 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070404() {
    super(new long[] {1, -1, 0, 0, 0, 1}, new long[] {1, 7, 5, 2, 3, 10});
  }
}

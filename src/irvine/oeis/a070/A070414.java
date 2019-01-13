package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070414.
 * @author Sean A. Irvine
 */
public class A070414 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070414() {
    super(new long[] {1, -1, 1}, new long[] {1, 7, 19});
  }
}

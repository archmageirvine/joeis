package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175922.
 * @author Sean A. Irvine
 */
public class A175922 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175922() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {1, 1, 2, -1, 2});
  }
}

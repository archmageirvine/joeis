package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079973.
 * @author Sean A. Irvine
 */
public class A079973 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079973() {
    super(new long[] {1, 0, 1, 1, 0}, new long[] {1, 0, 1, 1, 1});
  }
}

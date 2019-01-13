package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079975.
 * @author Sean A. Irvine
 */
public class A079975 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079975() {
    super(new long[] {1, 0, 1, 1, 1}, new long[] {1, 1, 2, 4, 7});
  }
}

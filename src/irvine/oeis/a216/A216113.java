package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216113.
 * @author Sean A. Irvine
 */
public class A216113 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216113() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {42, 477, 2241, 6846, 16380});
  }
}

package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079398.
 * @author Sean A. Irvine
 */
public class A079398 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079398() {
    super(new long[] {1, 1, 0, 0}, new long[] {0, 1, 1, 1});
  }
}

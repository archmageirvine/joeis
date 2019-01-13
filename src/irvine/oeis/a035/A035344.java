package irvine.oeis.a035;

import irvine.oeis.LinearRecurrence;

/**
 * A035344.
 * @author Sean A. Irvine
 */
public class A035344 extends LinearRecurrence {

  /** Construct the sequence. */
  public A035344() {
    super(new long[] {2, -6, 5}, new long[] {1, 5, 19});
  }
}

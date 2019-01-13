package irvine.oeis.a050;

import irvine.oeis.LinearRecurrence;

/**
 * A050935.
 * @author Sean A. Irvine
 */
public class A050935 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050935() {
    super(new long[] {-1, 0, 1}, new long[] {0, 0, 1});
  }
}

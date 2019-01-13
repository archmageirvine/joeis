package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216875.
 * @author Sean A. Irvine
 */
public class A216875 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216875() {
    super(new long[] {1, -2, 0, 2}, new long[] {10, 10, -10, 10});
  }
}

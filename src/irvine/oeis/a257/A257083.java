package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257083.
 * @author Sean A. Irvine
 */
public class A257083 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257083() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 2, 6, 9, 17});
  }
}

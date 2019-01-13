package irvine.oeis.a088;

import irvine.oeis.LinearRecurrence;

/**
 * A088981.
 * @author Sean A. Irvine
 */
public class A088981 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088981() {
    super(new long[] {1, -1, -2, 3}, new long[] {7, 11, 17, 25});
  }
}

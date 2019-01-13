package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155601.
 * @author Sean A. Irvine
 */
public class A155601 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155601() {
    super(new long[] {20, -32, 13}, new long[] {1, 9, 97});
  }
}

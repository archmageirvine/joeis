package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173635 Period 5 sequence: <code>1, 1, 4, 4, 2, ..</code>.
 * @author Sean A. Irvine
 */
public class A173635 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173635() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {1, 1, 4, 4, 2});
  }
}

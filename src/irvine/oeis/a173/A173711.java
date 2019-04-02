package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173711 Nonnegative integers, six even followed by two odd.
 * @author Sean A. Irvine
 */
public class A173711 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173711() {
    super(new long[] {-1, 1, 1, -1, -1, 1, 1}, new long[] {0, 0, 0, 0, 0, 0, 1});
  }
}

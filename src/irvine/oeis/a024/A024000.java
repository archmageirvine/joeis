package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024000 a(n) = 1 - n.
 * @author Sean A. Irvine
 */
public class A024000 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024000() {
    super(new long[] {-1, 2}, new long[] {1, 0});
  }
}

package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017249 <code>a(n) = (9*n + 7)^5</code>.
 * @author Sean A. Irvine
 */
public class A017249 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017249() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {16807, 1048576, 9765625, 45435424, 147008443, 380204032});
  }
}

package irvine.oeis.a060;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A060546 a(n) = 2^ceiling(n/2).
 * @author Sean A. Irvine
 */
public class A060546 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060546() {
    super(new long[] {2, 0}, new long[] {1, 2});
  }
}

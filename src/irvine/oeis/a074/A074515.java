package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074515 a(n) = 1^n + 4^n + 9^n.
 * @author Sean A. Irvine
 */
public class A074515 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074515() {
    super(new long[] {36, -49, 14}, new long[] {3, 14, 98});
  }
}

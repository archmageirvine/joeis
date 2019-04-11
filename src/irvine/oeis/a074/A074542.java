package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074542 <code>a(n) = 2^n + 6^n + 8^n</code>.
 * @author Sean A. Irvine
 */
public class A074542 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074542() {
    super(new long[] {96, -76, 16}, new long[] {3, 16, 104});
  }
}

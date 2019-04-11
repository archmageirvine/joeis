package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074614 <code>a(n) = 4^n + 9^n</code>.
 * @author Sean A. Irvine
 */
public class A074614 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074614() {
    super(new long[] {-36, 13}, new long[] {2, 13});
  }
}

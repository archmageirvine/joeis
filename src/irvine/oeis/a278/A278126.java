package irvine.oeis.a278;

import irvine.oeis.LinearRecurrence;

/**
 * A278126 a(n) = 78*n + 66.
 * @author Sean A. Irvine
 */
public class A278126 extends LinearRecurrence {

  /** Construct the sequence. */
  public A278126() {
    super(new long[] {-1, 2}, new long[] {66, 144});
  }
}

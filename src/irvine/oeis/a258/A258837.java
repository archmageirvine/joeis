package irvine.oeis.a258;

import irvine.oeis.LinearRecurrence;

/**
 * A258837 <code>a(n) = 1 - n^2</code>.
 * @author Sean A. Irvine
 */
public class A258837 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258837() {
    super(new long[] {1, -3, 3}, new long[] {1, 0, -3});
  }
}

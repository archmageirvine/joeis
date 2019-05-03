package irvine.oeis.a258;

import irvine.oeis.LinearRecurrence;

/**
 * A258684 <code>a(n) = A041105(4n+1)</code>.
 * @author Sean A. Irvine
 */
public class A258684 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258684() {
    super(new long[] {-1, 62}, new long[] {1, 63});
  }
}

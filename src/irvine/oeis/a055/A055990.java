package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055990 <code>a(n)</code> is its own 4th difference.
 * @author Sean A. Irvine
 */
public class A055990 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055990() {
    super(new long[] {-1, 4, -6, 5}, new long[] {1, 4, 14, 50});
  }
}

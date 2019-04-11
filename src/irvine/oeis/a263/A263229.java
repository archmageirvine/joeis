package irvine.oeis.a263;

import irvine.oeis.LinearRecurrence;

/**
 * A263229 <code>a(n) = 4*n*(21*n - 26)</code>.
 * @author Sean A. Irvine
 */
public class A263229 extends LinearRecurrence {

  /** Construct the sequence. */
  public A263229() {
    super(new long[] {1, -3, 3}, new long[] {0, -20, 128});
  }
}

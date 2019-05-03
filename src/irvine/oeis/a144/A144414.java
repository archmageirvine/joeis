package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144414 <code>a(n) = 2*(4^n - 1)/3 -</code> n.
 * @author Sean A. Irvine
 */
public class A144414 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144414() {
    super(new long[] {4, -9, 6}, new long[] {1, 8, 39});
  }
}

package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157924 <code>a(n) = 98*n - 1</code>.
 * @author Sean A. Irvine
 */
public class A157924 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157924() {
    super(new long[] {-1, 2}, new long[] {97, 195});
  }
}

package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266507 <code>a(n) = 6*a(n - 1) - a(n - 2)</code> with <code>a(0) = 2, a(1) = 8</code>.
 * @author Sean A. Irvine
 */
public class A266507 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266507() {
    super(new long[] {-1, 6}, new long[] {2, 8});
  }
}

package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078343 <code>a(0) = -1, a(1) = 2</code>; <code>a(n) = 2*a(n-1) + a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A078343 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078343() {
    super(new long[] {1, 2}, new long[] {-1, 2});
  }
}

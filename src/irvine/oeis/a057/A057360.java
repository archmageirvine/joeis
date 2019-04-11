package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057360 <code>a(n) = floor(3*n/8)</code>.
 * @author Sean A. Irvine
 */
public class A057360 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057360() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 0, 0, 1, 1, 1, 2, 2, 3});
  }
}

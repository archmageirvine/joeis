package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177065 <code>a(n) = (8*n+3)*(8*n+5)</code>.
 * @author Sean A. Irvine
 */
public class A177065 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177065() {
    super(new long[] {1, -3, 3}, new long[] {15, 143, 399});
  }
}

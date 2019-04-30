package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174091 <code>OR(n, 2)</code>.
 * @author Sean A. Irvine
 */
public class A174091 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174091() {
    super(new long[] {-1, 2, -2, 2}, new long[] {2, 3, 2, 3});
  }
}

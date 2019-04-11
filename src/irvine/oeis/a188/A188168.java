package irvine.oeis.a188;

import irvine.oeis.LinearRecurrence;

/**
 * A188168 <code>a(0) = a(1) = 1</code>; <code>a(n) = 5*a(n-1) + 5*a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A188168 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188168() {
    super(new long[] {5, 5}, new long[] {1, 1});
  }
}

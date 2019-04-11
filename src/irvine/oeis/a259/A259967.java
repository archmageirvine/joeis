package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259967 <code>a(n) = a(n-1) + a(n-2) + a(n-4)</code>.
 * @author Sean A. Irvine
 */
public class A259967 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259967() {
    super(new long[] {1, -1, 2}, new long[] {3, 2, 2});
  }
}

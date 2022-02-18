package irvine.oeis.a075;

import irvine.oeis.LinearRecurrence;

/**
 * A075427 a(0) = 1; a(n) = a(n-1)+1  if n is even, otherwise a(n) = 2*a(n-1).
 * @author Sean A. Irvine
 */
public class A075427 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075427() {
    super(new long[] {-2, 0, 3, 0}, new long[] {1, 2, 3, 6});
  }
}

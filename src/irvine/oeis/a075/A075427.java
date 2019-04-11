package irvine.oeis.a075;

import irvine.oeis.LinearRecurrence;

/**
 * A075427 <code>a(0) = 1</code>; <code>a(n) =</code> if n is even then <code>a(n-1)+1</code> else <code>2*a(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A075427 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075427() {
    super(new long[] {-2, 0, 3, 0}, new long[] {1, 2, 3, 6});
  }
}

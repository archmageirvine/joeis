package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253197 <code>a(n) = a(n-1) + a(n-2) + (1 - (-1)^(a(n-1) + a(n-2)))</code> with <code>a(0) = 0, a(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A253197 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253197() {
    super(new long[] {-1, -1, 1, 1, 1}, new long[] {0, 1, 3, 4, 9});
  }
}

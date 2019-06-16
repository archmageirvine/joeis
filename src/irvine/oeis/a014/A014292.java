package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014292 <code>a(n) = 2*a(n-1) - a(n-2) - a(n-4)</code> with <code>a(0) = a(1) = 0, a(2) = 1, a(3) = 2</code>.
 * @author Sean A. Irvine
 */
public class A014292 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014292() {
    super(new long[] {-1, 0, -1, 2}, new long[] {0, 0, 1, 2});
  }
}


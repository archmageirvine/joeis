package irvine.oeis.a004;

import irvine.oeis.LinearRecurrence;

/**
 * A004189 <code>a(n) = 10*a(n-1) - a(n-2)</code>; <code>a(0) = 0, a(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A004189 extends LinearRecurrence {

  /** Construct the sequence. */
  public A004189() {
    super(new long[]{-1, 10}, new long[] {0, 1});
  }
}

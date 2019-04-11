package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155464 <code>a(n) = 7*a(n-1) - 7*a(n-2) + a(n-3)</code> for <code>n &gt; 2</code>; <code>a(0) = 0, a(1) = 51, a(2) = 340</code>.
 * @author Sean A. Irvine
 */
public class A155464 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155464() {
    super(new long[] {1, -7, 7}, new long[] {0, 51, 340});
  }
}

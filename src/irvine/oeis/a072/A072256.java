package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072256 <code>a(n) = 10*a(n-1) - a(n-2)</code> for <code>n &gt; 1, a(0) = a(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A072256 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072256() {
    super(new long[] {-1, 10}, new long[] {1, 1});
  }
}

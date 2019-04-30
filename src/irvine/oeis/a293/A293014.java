package irvine.oeis.a293;

import irvine.oeis.LinearRecurrence;

/**
 * A293014 <code>a(n) = a(n-1) + a(n-2) - a(n-3) + a(n-4)</code> for <code>n &gt; 4</code>, where <code>a(n)=0</code> for <code>n &lt; 4</code> and <code>a(4) = 1</code>.
 * @author Sean A. Irvine
 */
public class A293014 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293014() {
    super(new long[] {1, 1, -1, 1, 1}, new long[] {0, 0, 0, 0, 1});
  }
}

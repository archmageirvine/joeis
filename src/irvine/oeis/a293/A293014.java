package irvine.oeis.a293;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A293014 a(n) = a(n-1) + a(n-2) - a(n-3) + a(n-4) for n &gt; 4, where a(n)=0 for n &lt; 4 and a(4) = 1.
 * @author Sean A. Irvine
 */
public class A293014 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293014() {
    super(new long[] {1, 1, -1, 1, 1}, new long[] {0, 0, 0, 0, 1});
  }
}

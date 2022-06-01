package irvine.oeis.a137;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A137208 a(n) = a(n-1) + 4*a(n-2) - 4*a(n-3) for n &gt; 2; a(0)=2, a(1)=3, a(2)=6.
 * @author Sean A. Irvine
 */
public class A137208 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137208() {
    super(new long[] {-4, 4, 1}, new long[] {2, 3, 6});
  }
}

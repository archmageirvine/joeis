package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137208 <code>a(n) = a(n-1) + 4*a(n-2) - 4*a(n-3)</code> for <code>n &gt; 2; a(0)=2, a(1)=3, a(2)=6</code>.
 * @author Sean A. Irvine
 */
public class A137208 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137208() {
    super(new long[] {-4, 4, 1}, new long[] {2, 3, 6});
  }
}

package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177044 <code>a(n) = 103*(n-1)-a(n-1)</code> with <code>n&gt;1, a(1)=38</code>.
 * @author Sean A. Irvine
 */
public class A177044 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177044() {
    super(new long[] {-1, 1, 1}, new long[] {38, 65, 141});
  }
}

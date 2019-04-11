package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081195 <code>a(n) = 10*a(n-1)-24*a(n-2)</code> for <code>n&gt;1, a(0)=1, a(1)=25</code>.
 * @author Sean A. Irvine
 */
public class A081195 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081195() {
    super(new long[] {-24, 10}, new long[] {1, 25});
  }
}

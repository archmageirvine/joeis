package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107979 <code>a(n) = 4*a(n-1) + 2*a(n-2)</code> for <code>n&gt;1,</code> with <code>a(0)=2, a(1)=9</code>.
 * @author Sean A. Irvine
 */
public class A107979 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107979() {
    super(new long[] {2, 4}, new long[] {2, 9});
  }
}
